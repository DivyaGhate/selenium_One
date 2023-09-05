package com.selenium.day11;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestforClass {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
	}
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("welcome");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("welcome2");
  }

}
