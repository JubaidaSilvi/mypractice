package ebaydropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdownebay {
	static WebDriver driver;

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win32\\chromedriver.exe");

	ChromeOptions ops= new ChromeOptions();
	ops.addArguments("Anything");
	driver= new ChromeDriver();
	
	// how to open browser
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	
	WebElement Allcategories =driver.findElement(By.id("gh-cat"));
	
	Allcategories.click();
	
	Select baby= new Select(driver.findElement(By.name("_sacat")));
	baby.selectByVisibleText("Baby");
	
	WebElement search = driver.findElement(By.id("gh-btn"));
	search.click();
	}

}
