/**
 * The TestValidatePassword.java file contains several UTs for password validation
 *
 * Author:Subodh Kumar
 * Version:1.0
 * Since:2022-11-23
 */
package tests.src;

import com.src.ValidatePassword;
import common.exception.PasswordException;
import common.status.Response;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestValidatePassword {
    ValidatePassword validatePassword=new ValidatePassword();

    @Test
    public void testNullPassword() throws PasswordException, InterruptedException {
        assertEquals(Response.NOT_OK,validatePassword.validate(null));
    }

    @Test
    public void testShortLengthPassword() throws PasswordException, InterruptedException {
        assertEquals(Response.NOT_OK,validatePassword.validate("Aabcd12"));
    }

    @Test
    public void testUppercasePassword() throws PasswordException,InterruptedException{
        assertEquals(Response.NOT_OK,validatePassword.validate("abcd234567"));
    }

    @Test
    public void tesLowercasePassword() throws PasswordException,InterruptedException{
        assertEquals(Response.NOT_OK,validatePassword.validate("ABCD1234567"));
    }

    @Test
    public void tesNumberPassword() throws PasswordException,InterruptedException{
        assertEquals(Response.NOT_OK,validatePassword.validate("ABCDabcdefgh"));
    }

    @Test
    public void tesCorrectPassword() throws PasswordException,InterruptedException{
        assertEquals(Response.OK,validatePassword.validate("abcdANBCD1234"));
    }
}
