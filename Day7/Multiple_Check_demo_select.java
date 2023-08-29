package day_7;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Check_demo_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement d = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		Select s = new Select(d);
		
//		List<WebElement> t = new ArrayList<WebElement>();
//		t = s.getOptions();
//		
		s.selectByIndex(2);
		Thread.sleep(5000);
		s.selectByIndex(3);
		
		List<WebElement> l1 = new ArrayList<WebElement>();
		l1 = s.getAllSelectedOptions();
		for(WebElement webelement : l1) {
			System.out.println(webelement.getText());
		}
		Thread.sleep(5000);
		s.deselectAll();
		Thread.sleep(5000);
		driver.close();
		
	}

}
