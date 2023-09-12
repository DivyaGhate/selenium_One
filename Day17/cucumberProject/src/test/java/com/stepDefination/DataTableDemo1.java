package com.stepDefination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableDemo1 {
	WebDriver driver;
	Homepage1 objhomepage1;
	
	@Given("user launches")
	public void user_launches() {
		
	}
	
	@When("^user enters the credential values$")
	public void user_enters_the_credential_values(DataTable datatable) {
		List<List<String>> credentialList=datatable.cells();
		int rows=datatable.height();
		int col=datatable.width();
	
	
	for(int i=0;i<rows;i++) {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		objhomepage1=new Homepage1(driver);
		objhomepage1.performLoginAction(credentialList.get(i).get(0),credentialList.get(i).get(1));
//		driver.findElement(By.id("user-name")).sendKeys(credentialList.get(i).get(0));
//		driver.findElement(By.id("password")).sendKeys(credentialList.get(i).get(1));
//		driver.findElement(By.id("login-button")).click();
		driver.quit();
	}
	}
	@Then("close the browser window and quit")
	public void close_the_browser_window_and_quit() {
		System.out.println("browser is closed!!");
	}
}
