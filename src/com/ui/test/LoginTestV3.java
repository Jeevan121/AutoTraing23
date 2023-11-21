package com.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.pages.LoginPage;
import com.ui.pages.LoginPageV1;
import com.utils.BaseTest;

public class LoginTestV3 {
	
	public static void main(String[] args) {
		BaseTest obj = new BaseTest();
		
		WebDriver driver = obj.launchApp("https://www.saucedemo.com/");
		obj.waitForElementTobeVisble(driver,driver.findElement(By.xpath("//input[@placeholder='Username']")));
		
		LoginPageV1 loginPage = new LoginPageV1(driver);
		loginPage.loginIntoApplication("standard_user", "secret_sauce");
		
		obj.waitForElementTobeVisble(driver, driver.findElement(By.xpath("//div[@class='app_logo']")));
		String title = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		System.out.println("The title of the page is ::"+title);
		
	}

}
