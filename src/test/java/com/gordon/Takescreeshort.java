package com.gordon;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreeshort {
	public static void main(String []args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Date currentDate = new Date();
		String screenShortFilename= currentDate.toString().replace(" ", "-").replace(":","-");
//		System.out.println(screenShortFilename);
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//install commons Io library to view screenshot
		FileUtils.copyFile(screenshotFile, new File(".//screenshort//"+screenShortFilename+".png"));
		
		
		
	    
	}

}
