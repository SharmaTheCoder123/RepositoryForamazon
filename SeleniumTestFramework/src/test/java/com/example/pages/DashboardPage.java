package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
	
	 // Locators
    private By usernameField = By.cssSelector("#ap_email");
    private By passwordField = By.cssSelector("#ap_password");
    private By loginButton = By.id("signInSubmit");
    private By signInHover = By.id("nav-link-accountList-nav-line-1");
    private By continueButton = By.xpath("//input[@id='continue']");
    private By mxplayertxt = By.xpath("//a[text()='MX Player']");
    private By selltxt = By.xpath("//a[text()='Sell']");
    private By bestsellertxt = By.xpath("//a[text()='Best Sellers']");
    
    // Methods to perform actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    public void clickSignInButton() {
    	  driver.findElement(signInHover).click();
    }
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public String verify_mxplayer_txt() {
    	return driver.findElement(mxplayertxt).getText();
    }
    
    public String verify_sell_txt() {
    	return driver.findElement(selltxt).getText();
    }
    
    public String verify_bestseller_txt() {
    	return driver.findElement(bestsellertxt).getText();
    }
}
