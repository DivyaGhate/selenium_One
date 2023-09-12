package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksandTagsDemo {

	WebDriver driver;
	
	@Before("@t1")
	public void before() {
		System.out.println("Before test");
	}
	@Given("Browser opens")
	public void browser_opens() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@When("open google page")
	public void open_google_page() {
		driver.get("https://google.com");
		
		String expectedString="Google";
	}
	@Then("validates titl of the page with expeted value")
	public void validates_titl_of_the_page_with_expeted_value() {
		Assert.assertEquals("Google", driver.getTitle());
	}
	
	@After("@t1")
	public void after() {
		System.out.println("Before test");
	}
	
}
