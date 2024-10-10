
package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By usernameField = By.cssSelector("#ap_email");
    private By passwordField = By.cssSelector("#ap_password");
    private By loginButton = By.id("signInSubmit");
    private By errorMessage = By.id("errorMessage");
    private By signInHover = By.id("nav-link-accountList-nav-line-1");
    private By continueButton = By.xpath("//input[@id='continue']");
    private By invalidMessage = By.xpath("//h4[contains(.,'There was a problem')]");
    
    // Methods to perform actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    public String validationInvalidMessage() {
       return  driver.findElement(invalidMessage).getText();
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

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
