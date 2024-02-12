package com.gordon;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static String browser ="Chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		
		driver.get("https://www.singaporeair.com/en_UK/sg/home#/book/bookflight");
		driver.manage().window().maximize();
		
		WebElement radio1= driver.findElement(By.id("redeemFlights"));
		radio1.click();
		System.out.println(radio1.isSelected());
		
	    System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
	
	
		
		
		
		
		
		 
		
	}

}
