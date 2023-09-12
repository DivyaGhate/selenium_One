package com.selenium.day11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng3 {
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Before test");
  }
	@Test
  public void f() {
		driver.get("https://bing.com");
		driver.manage().window().maximize();
  }
	
	@BeforeTest
	public void beforetest() {
		System.out.println("before second test");
	}
	
	@Test
	  public void f2() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://bing.com");
			driver.manage().window().maximize();
	  }
	
	@AfterTest
	public void afterTest() {
		System.out.println("driver closed!");
		driver.close();
	}
}
