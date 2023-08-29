package day_7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popups_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.xpath("//input[@name=\"cusid\"]"));
		textbox.sendKeys("1346");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
		
		Thread.sleep(3000);
		
		Alert alert1 = driver.switchTo().alert();
		String alert1_content=alert1.getText();
		System.out.println(alert1_content);
		alert1.accept();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
