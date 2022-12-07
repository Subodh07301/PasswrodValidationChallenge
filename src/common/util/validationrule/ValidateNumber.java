/**
 * Contain validation logic for Number persent in password or not?
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.util.validationrule;

import common.exception.PasswordException;
import common.status.ExceptionStatus;

public class ValidateNumber extends ValidateRule{
    @Override
    public void validate(String str) throws PasswordException {
        if(!containsNumber(str)){
            stopValidation();
            throw new PasswordException(ExceptionStatus.PASSWORD_NUMBER_ERROR);
        }
    }

    private boolean containsNumber(String value) {
        return contains(value, Character::isDigit);
    }
}
