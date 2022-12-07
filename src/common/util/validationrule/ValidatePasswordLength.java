/**
 * Contain validation logic Valid password length?
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.util.validationrule;

import common.exception.PasswordException;
import common.status.ExceptionStatus;

public class ValidatePasswordLength extends ValidateRule{
    @Override
    public void validate(String password) throws PasswordException {
        if(password.length()<8){
            stopValidation();
            throw new PasswordException(ExceptionStatus.PASSWORD_LENGTH_ERROR);
        }
    }
}
