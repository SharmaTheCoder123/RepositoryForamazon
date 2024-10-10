
package com.example.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
    	//WebDriverManager.chromedriver().clearResolutionCache().setup();
    	WebDriverManager.chromedriver().clearResolutionCache().browserVersion("129.0.6668.90").setup();
    	//WebDriverManager.cconfig().setVerbose(true);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
