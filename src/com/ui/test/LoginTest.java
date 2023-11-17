package com.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\auto_test_demo\\AutoTraing23\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
		
	}

}
