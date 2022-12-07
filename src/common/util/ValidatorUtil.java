/**
 * File ValidatorUtil.java will contain validate password which will
 * will validate different rule of validation at a time
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.util;

import common.exception.PasswordException;
import common.status.ExceptionStatus;
import common.status.Response;
import common.util.validationrule.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ValidatorUtil{
    CountDownLatch latch=null;
    public ValidatorUtil(){
        latch=new CountDownLatch(2);
    }

    public Response validate(final String password) throws InterruptedException, PasswordException {
        try {
            if(password==null){
                throw new PasswordException(ExceptionStatus.PASSWORD_CONTAIN_NULL_ERROR);
            }
            Thread t1 = new Thread(new ValidateTask(new ValidateLowerCase(),password,latch));
            Thread t2 = new Thread(new ValidateTask(new ValidatePasswordLength(),password,latch));
            Thread t3 = new Thread(new ValidateTask(new ValidateNumber(),password,latch));
            Thread t4 = new Thread(new ValidateTask(new ValidatePasswordUpperCase(),password,latch));
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            latch.await(100,TimeUnit.MILLISECONDS);
        }catch(Exception ex){
            ex.printStackTrace();
            return Response.NOT_OK;
        }
        return ValidateRule.isStopWork()?Response.NOT_OK:Response.OK;
    }
}
