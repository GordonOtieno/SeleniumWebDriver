package com.gordon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllLinks {
	public static String browser ="Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
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
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		//same can be done for options
		 List  <WebElement> elements=	driver.findElements(By.tagName("a"));
		 System.out.println("Total Number of tags is :"+elements.size());
		 for(int i=0; i< elements.size(); i++) {
			 System.out.println(elements.get(i).getAttribute("href"));
			 System.out.println(elements.get(i).getText());
		 }
		
	}

}
