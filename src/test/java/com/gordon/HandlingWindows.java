package com.gordon;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {
	public static void main(String[] ags) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/products/small-business/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),\"Accept All Cookies\")]")).click();
		driver.findElement(By.xpath("//*[@id=\"1680117526821_uvm\"]/div/article/div[2]/div/div/pbc-button[2]/a")).click();
		Thread.sleep(4000);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		Iterator< String> iterator = windowHandles.iterator();
		String parentWindow = iterator.next();
		System.out.println(parentWindow);
		String childWindow = iterator.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("Gordon");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("Otieno");
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
     	driver.quit();

	}

}
