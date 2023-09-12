package com.selenium.day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
  }
  @Test
  public void f2() {
	  driver=new ChromeDriver();
	  driver.get("https://www.bing.com/");
	  driver.manage().window().maximize();
  }
//  @BeforeMethod
//  public void beforeMethod() {
//	  WebDriverManager.chromedriver().setup();
//  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("hello!!");
	  driver.quit();
  }
}
