/**
 * Exception if Password does not contain lower case
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.exception;

import common.status.ExceptionStatus;

public class PasswordLowerCaseException extends  PasswordExceptionAbsract{
    PasswordLowerCaseException(){
        super();
    }
    @Override
    public ExceptionStatus getException(){
        return ExceptionStatus.PASSWORD_LOWERCASE_ERROR;
    }
}
