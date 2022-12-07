/**
 * Exception if Password does not contain any number
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.exception;

import common.status.ExceptionStatus;

public class PasswordNumberException extends PasswordExceptionAbsract{
    PasswordNumberException(){
        super();
    }
    @Override
    public ExceptionStatus getException() {
        return ExceptionStatus.PASSWORD_NUMBER_ERROR;
    }
}
