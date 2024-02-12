package com.gordon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
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
		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.className("")).sendKeys("testing");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		driver.close();
		
//		WebElement abc = driver.findElement(By.id("user-name"));
//		driver.findElement(withTagName("input").above(abc)).sendKeys("secret_sauce");
		String title = driver.getTitle();
		System.out.println(title);
        driver.manage().window().fullscreen();
        driver.navigate().to("https://gordonotieno.me/");   
	}

}
