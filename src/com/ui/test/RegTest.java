package com.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\auto_test_demo\\AutoTraing23\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customer.firstName")).sendKeys("Auto");
		driver.findElement(By.id("customer.lastName")).sendKeys("Test");
		
	}

}
