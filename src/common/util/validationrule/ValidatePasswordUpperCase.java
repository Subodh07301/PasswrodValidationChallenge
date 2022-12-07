/**
 * Contain validation logic for Uppercase persent in password or not?
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.util.validationrule;

import common.exception.PasswordException;
import common.status.ExceptionStatus;

public class ValidatePasswordUpperCase extends ValidateRule{
    @Override
    public void validate(String str) throws PasswordException {
        if(!containsUpperCase(str)){
            stopValidation();
            throw new PasswordException(ExceptionStatus.PASSWORD_UPPERCASE_ERROR);
        }
    }

    private boolean containsUpperCase(String value) {
        return contains(value, i -> Character.isLetter(i) && Character.isUpperCase(i));
    }
}
