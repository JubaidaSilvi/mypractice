package com.example.qa.example_project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrooldownregular {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions ops= new ChromeOptions();
				ops.addArguments("Anything");
				
				WebDriver driver= new ChromeDriver();
				// how to open url 
				driver.get("https://www.dell.com/en-us");
				driver.manage().window().maximize();
				
				
((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
System.out.println(driver.getCurrentUrl());
	}

}
