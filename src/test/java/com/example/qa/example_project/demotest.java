package com.example.qa.example_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class demotest {
	@Test
	public void method1() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions ops= new ChromeOptions();
				ops.addArguments("Anything");
				
				WebDriver driver= new ChromeDriver();
				// how to open url 
				driver.get("https://www.dell.com/en-us");
				driver.manage().window().maximize();
				
				Actions ac = new Actions(driver);
			
				WebElement element=driver.findElement(By.xpath("//span[text()='IT Infrastructure']"));
				ac.moveToElement(element).build().perform();
				
	}

}
