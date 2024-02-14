package com.gordon;



import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLHandle {
	public static void main(String []args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		//global profile capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		FirefoxOptions options= new FirefoxOptions();
		options.merge(dc);
		FirefoxDriver driver = new FirefoxDriver(options);

		driver.get("https://expired.badssl.com/");
		
	
	    
	}

}
