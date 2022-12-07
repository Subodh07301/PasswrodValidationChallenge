/**
 * Factory class to get an Instance of Exception
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.exception;

import common.status.ExceptionStatus;
import common.status.Response;

abstract class PasswordExceptionAbsract extends Exception{
    private ExceptionStatus exceptionStatus=null;
    PasswordExceptionAbsract(){

    }

    public static PasswordExceptionAbsract getExcpetionInstance(final ExceptionStatus exp){
        PasswordExceptionAbsract passwordExceptionAbsract=null;
        switch(exp){
            case PASSWORD_LENGTH_ERROR:
                passwordExceptionAbsract=new PasswordLengthException();
                break;
            case PASSWORD_NUMBER_ERROR:
                passwordExceptionAbsract=new PasswordNumberException();
                break;
            case PASSWORD_LOWERCASE_ERROR:
                passwordExceptionAbsract=new PasswordLowerCaseException();
                break;
            case PASSWORD_UPPERCASE_ERROR:
                passwordExceptionAbsract=new PasswordUpperCaseMissingException();
                break;
            case PASSWORD_CONTAIN_NULL_ERROR:
                passwordExceptionAbsract=new NullPasswordExcdption();
                break;
            default:
                break;
        }
        return passwordExceptionAbsract;

    }
    public abstract ExceptionStatus getException();

}
