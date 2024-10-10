
package com.example.tests;

import com.example.pages.LoginPage;
import com.example.utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSignInButton();
        loginPage.enterUsername("pshagarwal03@gmail.com");
        loginPage.clickContinueButton();
        loginPage.enterPassword("A@s1234word");
        loginPage.clickLoginButton();

        // Assuming a successful login redirects to dashboard
        String expectedUrl = "https://www.amazon.in/?ref_=nav_ya_signin";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login was unsuccessful with valid credentials.");
    }

    @Test
    public void invalidLoginTest() {
    	 LoginPage loginPage = new LoginPage(driver);
         loginPage.clickSignInButton();
         loginPage.enterUsername("pshagarwal03@gmail.co");
         loginPage.clickContinueButton();

        // Verifying the login failed and the error message is displayed
        String errorMsg = loginPage.validationInvalidMessage();
        String expectedMessage = "There was a problem";
        Assert.assertEquals(errorMsg, expectedMessage, "Error message for invalid login is not correct.");
    }
}
