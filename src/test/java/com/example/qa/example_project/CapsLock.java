package com.example.qa.example_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CapsLock {
	@Test
	public void CapsLoock() {
		// Set up system / how to open browser
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        WebDriver driver = new ChromeDriver(ops);

        // How to open URL
        driver.get("https://www.dell.com/en-us");
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.id("mh-search-input"));
        search.sendKeys(Keys.SHIFT,"monitor");
		
	}

}
