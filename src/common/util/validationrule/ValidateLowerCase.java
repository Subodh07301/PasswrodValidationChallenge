/**
 * Contain validate logic for lower case persent in password or not
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.util.validationrule;

import common.exception.PasswordException;
import common.status.ExceptionStatus;

public class ValidateLowerCase extends ValidateRule{
    public void validate(String password) throws PasswordException {

        if(!containsLowerCase(password)){
            stopValidation();
            throw new PasswordException(ExceptionStatus.PASSWORD_LOWERCASE_ERROR);
        }
    }
    public boolean containsLowerCase(String value) {
        return contains(value, i -> Character.isLetter(i) && Character.isLowerCase(i));
    }

}
