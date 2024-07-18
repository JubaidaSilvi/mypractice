package com.example.qa.example_project;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LinkTest {

    @Test
    public void countLinks() {
        // Set up system / how to open browser
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        WebDriver driver = new ChromeDriver(ops);

        // How to open URL
        driver.get("https://www.dell.com/en-us");
        List<WebElement> linkCount = driver.findElements(By.tagName("a"));
        System.out.println("Number of links on the page: " + linkCount.size());
        for (WebElement link : linkCount) {
            
            System.out.println(link.getAttribute("href"));
            // You can perform actions on each link here, such as clicking or getting text
        }


        

        driver.quit();
    }
}