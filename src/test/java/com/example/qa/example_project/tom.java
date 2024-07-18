package com.example.qa.example_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tom {

	WebDriver driver;
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		
ChromeOptions ops= new ChromeOptions();
		ops.addArguments("Anything");
		
		WebDriver driver= new ChromeDriver();
		// how to open url 
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		WebElement login2=  driver.findElement(By.id("login2"));
		login2.click();
		
	
		WebElement close=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[1]"));
		close.click();
	}
	

}
