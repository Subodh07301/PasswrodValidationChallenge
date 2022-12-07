/**
 * The Concrete Exception class which will use factory pattern for getting
 * different types of Exception
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.exception;

import common.status.ExceptionStatus;

public class PasswordException extends Exception{
    private ExceptionStatus exceptionNum=null;
    private PasswordExceptionAbsract passAbst=null;
    public PasswordException(final ExceptionStatus exceptionNum){
        this.exceptionNum=exceptionNum;
        passAbst=PasswordExceptionAbsract.getExcpetionInstance(exceptionNum);
    }

    public void printStackTrace(){
        System.out.println("Exception:"+passAbst.getException());
    }
}
