package com.gordon;



import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopups {
	public static String username="admin"; //Reading this from external XLS or CSV file
	public static String password="admin"; //Reading this from external XLS or CSV file
	public static void main(String []args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth/");
		//bypass login
	
	    
	}

}
