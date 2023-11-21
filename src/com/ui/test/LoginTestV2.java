package com.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.pages.LoginPage;
import com.utils.BaseTest;

public class LoginTestV2 {
	
	public static void main(String[] args) {
		BaseTest obj = new BaseTest();
		
		WebDriver driver = obj.launchApp("https://www.saucedemo.com/");
		obj.waitForElementTobeVisble(driver,driver.findElement(By.xpath("//input[@placeholder='Username']")));
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginIntoApplication("standard_user", "secret_sauce");
		
		obj.waitForElementTobeVisble(driver, driver.findElement(By.xpath("//div[@class='app_logo']")));
		String title = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		System.out.println("The title of the page is ::"+title);
		
	}

}
