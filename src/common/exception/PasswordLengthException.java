/**
 * Exception if Password length is not valid
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.exception;

import common.status.ExceptionStatus;

public class PasswordLengthException extends PasswordExceptionAbsract{
    PasswordLengthException(){
        super();
    }
    @Override
    public ExceptionStatus getException(){
        return ExceptionStatus.PASSWORD_LENGTH_ERROR;
    }
}
