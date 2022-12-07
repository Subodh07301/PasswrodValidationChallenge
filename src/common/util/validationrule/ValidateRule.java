/**
 * Abstract class to manage wrapper and factory to different validation logic?
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.util.validationrule;

import common.exception.PasswordException;

import java.util.Set;
import java.util.function.IntPredicate;

public abstract class ValidateRule {
    private static volatile boolean stopWork;
    ValidateRule(){
        stopWork=false;
    }

    public void validate(final String str) throws PasswordException {

    }

    boolean contains(String value, IntPredicate predicate) {
        return value.chars().anyMatch(predicate);
    }

    public void stopValidation(){
        stopWork=true;
    }

    public static final boolean isStopWork(){
        return stopWork;
    }
}
