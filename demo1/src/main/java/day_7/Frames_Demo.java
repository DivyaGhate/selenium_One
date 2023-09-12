package day_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		//switch to frame 1
		driver.switchTo().frame("frame1");
		
		WebElement heading = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		String name = heading.getText();
		System.out.println(name);
		
//		a.doubleClick(heading).perform();
		
		//switches to main page
		driver.switchTo().defaultContent();
		String name1 = heading.getText();
		System.out.println(name1);
		
		Thread.sleep(10000);
		driver.close();
	}

}
