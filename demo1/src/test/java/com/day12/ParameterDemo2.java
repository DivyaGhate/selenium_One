package com.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement uname = driver.findElement(By.name("Username"));
	  WebElement password = driver.findElement(By.name("Password"));
	  WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  uname.sendKeys("Admin");
	  password.sendKeys("admin123");
	  submit.click();
	  Thread.sleep(3000);
	  Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  }
  @Parameters("browser")
  @BeforeMethod
  public void beforeMethod(String b1) {
		  if(b1.equals("chrome")) {
//			  ChromeOptions co = new ChromeOptions();
//			  co.addArguments("");
			  driver.get("https://www.google.com/");
			  driver.manage().window().maximize();
		  }else if(b1.equals("edge")){
			  driver.get("https://www.edge.com/");
			  driver.manage().window().maximize();
		  }
		  
	  }
	  
  }

