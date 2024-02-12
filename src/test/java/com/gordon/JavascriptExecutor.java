package com.gordon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor {
	public static void main(String []args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		JavaScriptExecutor jsexec = (JavaScriptExecutor) driver;
		 //Print the title of the page
		 String script = "return document.title;";
		 String title = (String) jsexec.executeScript(script);
		 System.out.println(title);
		 
		 //click button 
		 
		 driver.switchTo().frame("iframeResult");
		 jsexec.executeScript("myFunction()");
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 
		 //Highlight button
		 WebElement button = driver.findElement(By.xpath("/html/body/button"));
		 jsexec.executeScript("arguments[0].style.border='5px solid red'", button);
		 
		 //scroll page
		 driver.navigate().to("https://www.w3schools.com/");
		 WebElement getStartedBtn = driver.findElement(By.xpath("//*[@id=\"getdiploma\"]/div/a"));
		 jsexec.executeScript("arguments[0].scrollIntoView(true);",getStartedBtn);
		
	}

}
