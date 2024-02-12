package com.gordon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

//	public static void main(String[]args) {
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.ebay.com/");
//		driver.manage().window().maximize();
//		
//		WebElement electronic = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
//	Actions action = new Actions(driver);
//	action.moveToElement(electronic).perform();
//	}
	
	//Draggeble 
	public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	
//	WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	driver.switchTo().frame(0);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("draggable"));
	Actions action = new Actions(driver);
	action.dragAndDrop(drag, drop).perform();
	}

}
