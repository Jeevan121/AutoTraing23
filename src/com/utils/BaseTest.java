package com.utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	
	WebDriver driver;
	public WebDriver launchApp(String url) {
		System.setProperty("webdriver.chrome.driver","D:\\auto_test_demo\\AutoTraing23\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void waitForElementTobeVisble(WebDriver driver,WebElement elem) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(elem));
		
	}
	
	public void waitForElementTobeClickable(WebDriver driver,WebElement elem) {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.elementToBeClickable(elem));
	}

}
