package com.gordon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
public static void main(String [] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.skysports.com/football/tables");
	driver.manage().window().maximize();
	/*
	 * navigate to frame with the table
	 * Get the number of rows
	 * get the number of columns
	 * iterate through the rows and columns to get the text
	 */
//	WebElement frame1 = driver.findElement(By.id(""));
//	driver.switchTo().frame(frame1);
	
//	driver.findElement(By.xpath("//*[@id=\"notice\"]/div[5]/button[3]")).click();
    List<WebElement> rowElements = driver.findElements(By.xpath("//*[@id=\"widgetLite-2\"]/div[1]/div[4]/div[1]/div[2]/div/a[1]/table/tbody/tr"));
	int rowSize= rowElements.size();
	List<WebElement> colElements = driver.findElements(By.xpath("//*[@id=\"widgetLite-2\"]/div[1]/div[4]/div[1]/div[2]/div/a[3]/table/thead/tr/th"));
	int colSize = colElements.size();
//	System.out.println(rowElements.size());
//	System.out.println(colElements.size());
	for(int i=1; i<=rowSize;i++) {
		for(int j=1; j<=colSize; j++) {
		System.out.print(driver.findElement(By.xpath("//*[@id=\"widgetLite-2\"]/div[1]/div[4]/div[1]/div[2]/div/a[1]/table/tbody/tr["+i+"]/td["+j+"]"))
				.getText()+" ");
			
		}
		System.out.println();
	}
	
	
}
}
