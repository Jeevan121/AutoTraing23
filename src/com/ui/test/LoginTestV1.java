package com.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.BaseTest;

public class LoginTestV1 {
	
	public static void main(String[] args) {
		BaseTest obj = new BaseTest();
		WebDriver driver = obj.launchApp("https://www.saucedemo.com/");
		
		obj.waitForElementTobeVisble(driver,driver.findElement(By.xpath("//input[@placeholder='Username']")));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		
		obj.waitForElementTobeVisble(driver,driver.findElement(By.xpath("//input[@placeholder='Password']")));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		
		//login-button
		obj.waitForElementTobeClickable(driver, driver.findElement(By.id("login-button")));
		driver.findElement(By.id("login-button")).click();
		
		
		obj.waitForElementTobeVisble(driver, driver.findElement(By.xpath("//div[@class='app_logo']")));
		String title = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		System.out.println("The title of the page is ::"+title);
		
	}

}
