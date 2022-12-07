/**
 * Exception if Password missing upercase letter
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.exception;

import common.status.ExceptionStatus;

public class PasswordUpperCaseMissingException extends PasswordExceptionAbsract{
    PasswordUpperCaseMissingException(){
        super();
    }
    @Override
    public ExceptionStatus getException(){
        return ExceptionStatus.PASSWORD_UPPERCASE_ERROR;
    }

}
