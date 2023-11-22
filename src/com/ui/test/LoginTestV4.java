package com.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ui.pages.LoginPageV1;
import com.utils.BaseTest;

public class LoginTestV4 {
	
	BaseTest obj;
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		obj = new BaseTest();
		driver = obj.launchApp("https://www.saucedemo.com/");
		obj.waitForElementTobeVisble(driver,driver.findElement(By.xpath("//input[@placeholder='Username']")));
			
	}
	
	@Test
	public void loginTest() {
		LoginPageV1 loginPage = new LoginPageV1(driver);
		loginPage.loginIntoApplication("standard_user", "secret_sauce");
		
		obj.waitForElementTobeVisble(driver, driver.findElement(By.xpath("//div[@class='app_logo']")));
		String title = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		System.out.println("The title of the page is ::"+title);
		Assert.assertEquals(title, "Swag Labs","Home Title not matching");

	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
