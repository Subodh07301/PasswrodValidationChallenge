/**
 * Validation Task to start the validation
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.util;

import common.exception.PasswordException;
import common.util.validationrule.ValidateRule;

import java.util.concurrent.CountDownLatch;

public class ValidateTask implements Runnable{
    private ValidateRule ValidateRule=null;
    private String password=null;
    private CountDownLatch latch=null;
    ValidateTask(final ValidateRule validateRule,
                 final String password,final CountDownLatch latch){
        this.password=password;
        this.ValidateRule=validateRule;
        this.latch=latch;
    }
    public void run() {
        try {
            if(!ValidateRule.isStopWork()){
                ValidateRule.validate(password);
            }
        } catch (PasswordException e) {
            e.printStackTrace();
        }
    }
}
