package com.selenium.demo1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;



public class Browser1 {

	public static void main( String[] args )

	{

		// browser setup

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dghate\\Downloads\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.setBinary("C:\\Users\\dghate\\Downloads\\chrome-win64\\chrome.exe");

		//Chrome driver object

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://www.google.com");

	}

}
