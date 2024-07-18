package com.example.qa.example_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	@Test
	public void Verifytitle() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("Anything");
		WebDriver driver= new ChromeDriver();
		// How to open url 
		driver.get("https://www.dell.com/en-us");
		
		// Title should be content="Computers, Monitors & Technology Solutions | Dell USA"
		String expectedresult = "Computers, Monitors & Technology Solutions | Dell USA";
		String Actualresult= driver.getTitle();
		if(Actualresult.equals(expectedresult)) {
		System.out.println("Testcase pass");}
		
		else {System.out.println("testcase fail");}
		
		Assert.assertEquals( Actualresult,expectedresult);
	}

}
