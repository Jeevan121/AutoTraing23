package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	  By userName = By.xpath("//input[@placeholder='Username']");
	
	  
	  WebElement userNameTxt= driver.findElement(By.xpath("//input[@placeholder='Username']")); 
	  
	  @FindBy
	  WebElement passwordTxt=driver.findElement(By.xpath("//input[@placeholder='Password']")); 
	 
	  @FindBy
	  WebElement loginBtn= driver.findElement(By.id("login-button"));
	 
	
	public void loginIntoApplication(String userName,String password) {
		userNameTxt.sendKeys(userName);
		passwordTxt.sendKeys(password);
		loginBtn.click();
	}
	
}
