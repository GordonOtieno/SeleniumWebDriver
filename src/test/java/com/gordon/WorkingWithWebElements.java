package com.gordon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements {
	public static String browser= "Chrome";
	public static WebDriver driver;
	

 public static void main(String []args) {
	 if(browser.equals("Chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
	 }
	 else if (browser.equals("Edge")) {
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	 }
	 driver.get("https://www.sugarcrm.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
     driver.findElement(By.xpath("//*[@id=\"menu-item-22271\"]/a/span[1]")).click();
	 driver.findElement(By.name("email")).sendKeys("test@test.com");
	 driver.findElement(By.name("email")).clear();
	 System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div[2]/div/div/div[2]/h1")).getText());
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
	 
 }

}
