package com.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.utils.BaseTest;


public class RegTestV1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseTest obj = new BaseTest();
		
		WebDriver driver =obj.launchApp("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.findElement(By.linkText("Register")).click();
	
		
		obj.waitForElementTobeVisble(driver,driver.findElement(By.id("customer.firstName")));
		driver.findElement(By.id("customer.firstName")).sendKeys("Auto");
		
		obj.waitForElementTobeVisble(driver,driver.findElement(By.id("customer.lastName")));
		driver.findElement(By.id("customer.lastName")).sendKeys("Test");
		
		driver.findElement(By.name("customer.address.street")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Bangalore");
		driver.findElement(By.id("customer.address.state")).sendKeys("Karnataka");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("560091");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9880766775");
		driver.findElement(By.id("customer.ssn")).sendKeys("123123");
		driver.findElement(By.id("customer.username")).sendKeys("Test121");
		driver.findElement(By.id("customer.password")).sendKeys("Pass@123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("Pass@123");
		
		
		obj.waitForElementTobeClickable(driver, driver.findElement(By.xpath("//input[@value='Register']")));
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
		
	}

}
