package com.example.qa.example_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Second_test {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("anything");
				WebDriver driver = new ChromeDriver(ops);
				
				// how to open url
				driver.get("https://demoblaze.com/");
				
				driver.manage().window().maximize();
				//Thread.sleep(5000);
				WebElement login2=  driver.findElement(By.id("login2"));
				login2.click();
				
				//driver.close();
				
				WebElement username= driver.findElement(By.id("loginusername"));
				username.sendKeys("Silvi");
				
				WebElement password= driver.findElement(By.id("loginpassword"));
				
				password.sendKeys("S123456");
				// Thread.sleep(1000);
				
				

	}

}
