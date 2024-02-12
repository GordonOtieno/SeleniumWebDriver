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

public class CheckBox {
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
		
		driver.get("https://www.sugarcrm.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-22271\"]/a/span[1]")).click();
		driver.findElement(By.id("doi0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("doi0")).click();
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input"));
		Actions actions = new Actions(driver);
		actions.moveToElement(button);
		actions.perform();
		//Get the available checkboxes in my page
	    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());	
		
	
		
		
		
		
		
		 
		
	}

}
