package com.selenium.demo1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Global_SQA {

	public static void main(String[] args) throws Exception {
	

        System.setProperty("webdriver.chrome.driver","C:\\Users\\dghate\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Users\\dghate\\Downloads\\chrome-win64\\chrome.exe");
 

        //Chrome driver object
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.globalsqa.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("selenium",Keys.ENTER);
        
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[2]/div/div[2]/ol/li[2]/div/h3/a")).click();
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(0,250)");
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        jse.executeScript("window.scrollBy(0,-10000)");
        //clicking testers hub
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"menu-item-2822\"]/a")).click();
        
//        driver.findElement(By.xpath("  //*[@id=\"menu-item-2822\"]/a")).click();
        
        //driver.findElement(By.xpath("//*[@id=\"menu-item-2846\"]/a/span")).click();

        String name = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/div[2]/h1")).getText(); 
        System.out.println(name); 
	
        driver.close();
	
	}

}





