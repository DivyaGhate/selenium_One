package home_assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//		Thread.sleep(3000);

		//click on pathologist
		driver.findElement(By.xpath("//a[@style='background:#e91e63;']")).click();
		//click on sign in
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//click on messaging
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a")).click();
		//click on post new message
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']")).click();
		//write into title
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("ABC");
		//get into description
		WebElement webelement =  driver.findElement(By.xpath("/html/body"));
		Actions action = new Actions(driver);   
		action.moveToElement(webelement).click().perform();
		action.sendKeys("ABC").perform();


		Thread.sleep(3000);

		WebElement datepicker1 = driver.findElement(By.id("date"));
		datepicker1.sendKeys("05/03/2022");
		//		JavascriptExecutor js = (JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].setAttribute('value','05/03/2022')", datepicker1);

		WebElement datepicker2 = driver.findElement(By.xpath("//*[@id=\"publish_date\"]"));
		datepicker2.sendKeys("05/03/2023");
		//		js.executeScript("arguments[0].setAttribute('value','09/22/2022')", datepicker2);

		//click on send
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).click();

		WebElement successfull_msg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]"));
		String msg = successfull_msg.getText();
		System.out.println(msg);

		//validation
		if(msg.equals("Record Saved Successfully")) {
			System.out.println("Message is verified");
		} else {
			System.out.println("Message is not verified");
		}



		//		Thread.sleep(3000);
		//		driver.close();
	}

}
