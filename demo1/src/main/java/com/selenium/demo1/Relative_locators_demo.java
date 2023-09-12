package com.selenium.demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative_locators_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.get("https://www.softwaretestingmaterial.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Object of Explicit wait

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        By user =RelativeLocator.with(By.tagName("input")).below(By.className("oxd-input-group__label-wrapper"));

        wait.until(ExpectedConditions.elementToBeClickable(user));

        WebElement a= driver.findElement(user);

        a.sendKeys("Admin");
        

        By pass=RelativeLocator.with(By.name("password")).above(By.tagName("button"));

        wait.until(ExpectedConditions.elementToBeClickable(pass));

        WebElement element=driver.findElement(pass);

        element.sendKeys("admin123");

        By login=RelativeLocator.with(By.tagName("button")).below(By.name("password"));

        wait.until(ExpectedConditions.elementToBeClickable(login));

        WebElement clickButton=driver.findElement(login);

        clickButton.click();
       
		
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div"));
//		//below relative locator
//		WebElement username = driver.findElement(RelativeLocator.with(By.tagName("input")).below(element));
//		username.sendKeys("Admin");
//		
//		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//		
//		//above relative locator
//		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).above(login));
//		password.sendKeys("admin123");	
		
//		
		
//		
		
		// getting the search button toRightOf  

//        WebElement element = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));      
//        WebElement right = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(element));
//        right.click();
//
//        // getting the search button toLeftOf
//
//        WebElement elementOne = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));      
//
//        WebElement left = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(element));
//
//        left.click();
//
//        //near by
//
//        WebElement elementTwo = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));      
//
//        WebElement near = driver.findElement(RelativeLocator.with(By.tagName("img")).near(element));
//
//        near.click();
        
        

//		login.click();
//		
//		driver.close();
	}

}
