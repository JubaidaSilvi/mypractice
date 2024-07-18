package com.example.qa.example_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class drugDrop {
	@Test
	public void DrugDrop() throws Throwable {
		
		// Set up system / how to open browser
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        WebDriver driver = new ChromeDriver(ops);

        // How to open URL
        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
        driver.manage().window().maximize();
        WebElement source =driver.findElement(By.xpath("/html/body/section/div[1]/div[1]/div/div[2]/ul/li[1]/ul/li[1]/ul/li[1]/ul/li/div"));
        
        WebElement destination=driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/ul"));
        Actions ac = new Actions(driver);
        Thread.sleep(5000);
        
        ac.dragAndDrop(source,destination).build().perform();
        
	}

}
