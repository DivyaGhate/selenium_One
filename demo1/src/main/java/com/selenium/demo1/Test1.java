package com.selenium.demo1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {


            public static void main(String[] args) {

                WebDriverManager.edgedriver().setup();
                WebDriver driver=new EdgeDriver();
                driver.manage().window().maximize();
                driver.switchTo().newWindow(WindowType.TAB);
                driver.get("https://www.google.co.in/");
//                
//                driver.findElement(By.name("q")).sendKeys("google");
//                driver.findElement(By.className("gLFyf")).submit();
//                
//                WebElement gmailbtn = driver.findElement(By.partialLinkText("Gma"));
//                gmailbtn.click();
//                boolean isgmailenabled = gmailbtn.isEnabled();
//                System.out.println(isgmailenabled);
//                
//                WebElement searchboxelement = driver.findElement(By.id("APjFqb"));
//                String valueofsrboxid = searchboxelement.getAttribute("maxLength");
//                System.out.println(valueofsrboxid);
//                
//                WebElement searchboxelement = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]\r\n"));
//                String valueofsrboxid = searchboxelement.getAttribute("maxLength");
//                System.out.println(valueofsrboxid);
                
                WebElement searchboxelement = driver.findElement(By.xpath("//*[starts-with(@id,'A')]"));
//                String valueofsrboxid = searchboxelement.getAttribute("maxLength");
                System.out.println(searchboxelement);
                
                
                
            }

        }

 

 