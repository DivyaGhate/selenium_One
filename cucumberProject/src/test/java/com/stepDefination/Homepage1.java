package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage1 {
	
	WebDriver driver;
	
	By username=By.xpath("//input[@name='user-name']");
	By password=By.xpath("//input[@name='password']");
	By loginBTN=By.xpath("//input[@name='login-button']");
	
	public Homepage1(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setusernameMethod(String uname ) {
		 driver.findElement(username).sendKeys(uname);
	}
	
	public void setpasswordMethod(String pass) {
		 driver.findElement(password).sendKeys(pass);
	}
	public void clickLogin()
	{
		driver.findElement(loginBTN).click();
	}
	
	public void performLoginAction(String uname,String pass)
	{
		this.setusernameMethod(uname);
		this.setpasswordMethod(pass);
		this.clickLogin();
	}
}
