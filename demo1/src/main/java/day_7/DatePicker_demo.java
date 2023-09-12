package day_7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.abhibus.com/bus-ticket-booking");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//enter source location
		WebElement src = driver.findElement(By.id("source"));
		src.sendKeys("Coimbatore");
		Thread.sleep(2000);
		//enter destination
		WebElement dest = driver.findElement(By.id("destination"));
		dest.sendKeys("chennai");
		Thread.sleep(2000);
		
		WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].setAttribute('value','04/10/2023')", datepicker);
		
//		datepicker.sendKeys("")
		
		//click on search button
		driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
		
//		Thread.sleep(5000);
//		driver.close();
		
	}

}
