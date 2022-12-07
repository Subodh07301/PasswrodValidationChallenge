/**
 * Exception if Password is NULL
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.exception;

import common.status.ExceptionStatus;

public class NullPasswordExcdption extends PasswordExceptionAbsract{
    NullPasswordExcdption(){
        super();
    }
    @Override
    public ExceptionStatus getException(){
        return ExceptionStatus.PASSWORD_CONTAIN_NULL_ERROR;
    }
}
