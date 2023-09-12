package day_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Table_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();



		List<WebElement> table_data = new ArrayList<WebElement>();

		List<String> str = new ArrayList<String>();

		table_data = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[3]"));



		for(WebElement webelement : table_data) {

			str.add(webelement.getText());

		}

		Collections.sort(str);

		for(String webelement : str) {

			System.out.println(webelement);
		}

		Thread.sleep(3000);
		driver.close();

	}

}
