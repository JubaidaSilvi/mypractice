package com.example.qa.example_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class myfirstautomation {
	WebDriver driver;

	public static void main(String[] args) {
		// set up system / how to open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
ChromeOptions ops= new ChromeOptions();
ops.addArguments("anything");
		WebDriver driver = new ChromeDriver(ops);
		
		// how to open url
		driver.get("https://www.dell.com/en-us");
		
		driver.manage().window().maximize();
		driver.close();
	}

}
