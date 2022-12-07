/**
 * The main entry point for validation logic which will call Validation util
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package com.src;

import common.exception.PasswordException;
import common.status.Response;
import common.util.ValidatorUtil;

public class ValidatePassword {
    private ValidatorUtil validatorUtil=null;
    public ValidatePassword(){
        validatorUtil=new ValidatorUtil();
    }

    public Response validate(String password) throws PasswordException, InterruptedException {
        return validatorUtil.validate(password);
    }
}
