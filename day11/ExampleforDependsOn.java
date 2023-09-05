package com.selenium.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleforDependsOn {
	WebDriver driver; 
	@Test
	public void f() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver(); 
		  driver.get("https://www.google.com/");
		  
	  }
	  @Test(dependsOnMethods = {"f"})
	  public void f1() {
		  
		  driver.findElement(By.name("q1")).sendKeys("Depends on",Keys.ENTER);
	  }
	  @Test(dependsOnMethods = {"f","f1"})
	  public void f2() {
		  
		 driver.quit();
	  }
	  
	

}
