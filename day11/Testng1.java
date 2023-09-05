package com.selenium.day11;
import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng1 {
  WebDriver driver;
	@Test
  public void f() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
  }
	
	@Test
	  public void f2() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://bing.com");
			driver.manage().window().maximize();
	  }
	
}
