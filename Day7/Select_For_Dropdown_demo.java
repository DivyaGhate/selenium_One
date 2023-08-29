package day_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_For_Dropdown_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//select obj for sortby dropdown
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		//list of webelements
		List<WebElement> l1 = s.getOptions();
		//list of string type
		List<String> strings = new ArrayList<String>();
		//add all webelements in strings list as string type
		for(WebElement webelement:l1) {
			strings.add(webelement.getText());
		}
		//select the option of dropdown using index of it
//		s.selectByIndex(2);
		
		//select option of dropdown using value of the element
//		s.selectByValue("https://demo.opencart.com/index.php?route=product/"
//				+ "category&language=en-gb&path=24&sort=p.price&order=ASC");
		
		//it is using visible text for the option in dropdown
		s.selectByVisibleText("Rating (Highest)");
		
		//now sort the strings list
		Collections.sort(strings);
		
		//prints the list accending order
		for(String webelement:strings) {
			System.out.println(webelement);
		}
//		System.out.println(strings);
		
		Thread.sleep(10000);
		driver.close();
	}

}
