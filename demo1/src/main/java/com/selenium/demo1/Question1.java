package com.selenium.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();

        WebDriver driver=new EdgeDriver();
		
        driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]")).isEnabled());

        System.out.println(driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]")).isSelected());

        driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]")).click();        

        driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]")).click();

 

        driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]")).isSelected());

        System.out.println(driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]")).isSelected());

	}}

