package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationTest1 {
	 WebDriver driver = new ChromeDriver();
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
	   
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}

//	@When("User provides {string} and {string}")
	@When("User provides (.*) and (.*)$")
	public void user_provides_username_and_password(String username, String password) {
//		WebDriver driver = new ChromeDriver();
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
//		WebDriver driver = new ChromeDriver();
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user should be redirected to the homepage")
	public void user_should_be_redirected_to_the_homepage() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		Thread.sleep(3000);
		driver.quit();
	}

}
