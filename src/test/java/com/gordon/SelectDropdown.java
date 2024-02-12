package com.gordon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	public static String browser= "Chrome";
	public static WebDriver driver;
	

 public static void main(String []args) throws Exception {
	 if(browser.equals("Chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
	 }
	 else if (browser.equals("Edge")) {
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	 }
	 driver.get("https://www.sugarcrm.com/uk/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
	 WebElement ddown = driver.findElement(By.name("awareness_source_c"));
	Thread.sleep(2000);
	 Select select = new Select(ddown);
	 select.selectByVisibleText("YouTube");
	 Thread.sleep(2000);
	 select.selectByValue("Podcast");
	 Thread.sleep(2000);
	 select.selectByIndex(4);
	 
	 
 }

}
