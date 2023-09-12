package com.selenium.demo1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//setting up driver
		WebDriverManager.edgedriver().setup();
		
		
		//creating driver object for webdriver class(driver is mapped with edge browser)
		WebDriver driver=new EdgeDriver();
		
//		driver.get("https://www.google.co.in/");
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		driver.navigate().refresh();
//
//		driver.getCurrentUrl();
//		driver.getPageSource();
//		
		
		
//		Set<String> handles = driver.getWindowHandles();
//		for(String h : handles) {
//			System.out.println(driver.switchTo().window(h));
//			System.out.println(driver.getTitle());
//		}
		
		
//		
	}

}
