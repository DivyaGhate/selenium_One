package com.selenium.day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation2 {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Welcome to test case!!");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
	}
  @Test(priority = 2)
  public void f() {
	  
	  driver = new ChromeDriver(); 
	  driver.get("https://www.bing.com/");
	  
  }
  @Test(priority = 1)
  public void f2() {
	  
	  driver = new ChromeDriver(); 
	  driver.get("https://www.google.com/");
  }
  @Test
  public void f3() {
	  
	  driver = new ChromeDriver(); 
	  driver.get("https://www.demoblaze.com/");
  }
  @AfterMethod 
  public void afterTest() {
	  driver.manage().window().maximize();
//	  driver.close();
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite!");
  }
  
}
