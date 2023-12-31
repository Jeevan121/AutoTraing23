package com.ui.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\auto_test_demo\\AutoTraing23\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Register")).click();
		//Thread.sleep(1000);//our script execution
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("customer.firstName"))));
		
		driver.findElement(By.id("customer.firstName")).sendKeys("Auto");
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
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='Register']"))));
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
		
	}

}
