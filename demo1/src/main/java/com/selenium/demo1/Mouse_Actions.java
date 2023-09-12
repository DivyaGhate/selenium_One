package com.selenium.demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//for browserstack website 
		
//		driver.get("https://www.browserstack.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		Actions a = new Actions(driver);
//		
//		WebElement hoverElement = driver.findElement(By.xpath("//*[@id=\"products-dd-toggle\"]"));
//		
//		//right click on given element
////		a.contextClick(hoverElement).perform();
//		
//		//hover on the given element
////		a.moveToElement(hoverElement).perform();
//		
//		//double click the element
//		a.doubleClick(hoverElement.findElement(By.xpath
//				("//*[@id=\"post-26\"]/section/div[1]/div/div/div/article[1]/div/div/div/div[1]/h1"))).
//						build().perform();
		
		//for demoqa website
		
//		driver.get("https://demoqa.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		JavascriptExecutor jss = (JavascriptExecutor)driver;
//
//        jss.executeScript("window.scrollBy(0,70)", "");
//        
////		Thread.sleep(3000);
//		
//		Actions a = new Actions(driver);
//		
//		WebElement drag_me = driver.findElement(By.id("draggable"));
//		WebElement drop_here = driver.findElement(By.id("droppable"));
////		
////		a.clickAndHold(drag_me).release(drop_here).build().perform();
//		
//		a.dragAndDrop(drag_me, drop_here).perform();
		
		//for google website and keyboard operations
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions a = new Actions(driver);
		
		WebElement search_box = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		a.keyDown(Keys.SHIFT);
		a.sendKeys("hello").build().perform();
		
		a.keyUp(Keys.SHIFT);
		a.sendKeys("how r u?").perform();
		
		Thread.sleep(20000);

        driver.close();
        
		
		
	}

}
