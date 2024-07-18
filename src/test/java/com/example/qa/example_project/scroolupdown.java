package com.example.qa.example_project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class scroolupdown {
	@Test
	public void Silvi() {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions ops= new ChromeOptions();
				ops.addArguments("Anything");
				
				WebDriver driver= new ChromeDriver();
				// how to open url 
				driver.get("https://www.dell.com/en-us");
				driver.manage().window().maximize();
				
				((JavascriptExecutor)driver).executeScript("scrool(0,900)");
	}

}
