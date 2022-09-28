package forgetPasswordTesting;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgetPasswordTest extends BaseTests {

    @Test
    public void testRetrievePassword() {
        var forgetPassword = homePage.clickForgetPassword();
        forgetPassword.setEmail("tau@example.com");
        forgetPassword.clickRetrievePasswordButton();

        assertEquals(forgetPassword.getRetrieveText(), "Internal Server Error");
    }
}
