package com.day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupDemo2 {
	WebDriver driver;
  @Test(groups = "G1")
  public void f1() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
  
  @Test(groups="G2",dependsOnGroups = "G1")
  public void f2() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	  
  }
  
  @Test(groups="G2",dependsOnGroups = "G1")
  public void f3() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.navigate().back();
	  
  }
  
  @Test(groups="G3",dependsOnGroups = {"G1", "G2"})
  public void f4() {
	  driver.quit();
  }
}
