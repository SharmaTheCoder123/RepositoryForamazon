package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pages.DashboardPage;
import com.example.utils.TestBase;

public class DashboardTest extends TestBase{

	 @Test(priority=1)
	    public void verifydashboardTest() {
		 DashboardPage dashboard = new DashboardPage(driver);
		 dashboard.clickSignInButton();
		 dashboard.enterUsername("pshagarwal03@gmail.com");
		 dashboard.clickContinueButton();
		 dashboard.enterPassword("A@s1234word");
		 dashboard.clickLoginButton();
		 

	        // Assuming a successful login redirects to dashboard
	        String expectedUrl = "https://www.amazon.in/?ref_=nav_ya_signin";
	        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login was unsuccessful with valid credentials.");
	        
	        //Assume buttontext
	        String expectedText = "MX Player";
	        String actualText = dashboard.verify_mxplayer_txt();
	        Assert.assertEquals(actualText, expectedText, "mxplayer button text is not correct.");
	        
	        String expectedsell_txt = "Sell";
	        String actualsell_txt = dashboard.verify_sell_txt();
	        Assert.assertEquals(actualsell_txt, expectedsell_txt, "sell button text is not correct.");
	       
	        String expectedBestseller_txt = "BestSellar";
	        String actualBestseller_txt = dashboard.verify_sell_txt();
	        Assert.assertEquals(actualBestseller_txt, expectedBestseller_txt, "Bestseller button text is not correct.");
}
	 
}