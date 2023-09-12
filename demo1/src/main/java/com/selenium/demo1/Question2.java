package com.selenium.demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions co = new ChromeOptions();
//		
//		co.addArguments("remote-allow- origins");
//		
//		WebDriver driver = new ChromeDriver(co);
//		
//		driver.get("https://www.flipkart.com/");
//		
//		driver.manage().window().maximize();
		
//		Thread.sleep(3000);
		
//		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
//		
//		driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[2]"));
//		
//		Thread.sleep(3000);
		
//		List<WebElement> data = driver.findElements(By.className("_3704LK"));
//		
//		for(WebElement we : data) {System.out.println(we.getText());}
		
		WebDriverManager.edgedriver().setup();

        WebDriver driver=new EdgeDriver();

        driver.get("https://www.flipkart.com/");

        driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[2]")).click();
	
//        driver.findElement(By.name("q")).sendKeys("samsung galaxy f04",Keys.ENTER);
        
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript("windows.scrollBy(0,10000)", "");
        
        Thread.sleep(5000);
	}

}
