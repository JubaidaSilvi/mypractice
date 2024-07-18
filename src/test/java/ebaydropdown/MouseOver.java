
package ebaydropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	static WebDriver driver;

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions ops= new ChromeOptions();
				ops.addArguments("Anything");
				
				driver= new ChromeDriver();
				// how to open url 
				driver.get("https://www.dell.com/en-us");
				driver.manage().window().maximize();
				
				Actions ac = new Actions(driver);
			
				WebElement element=driver.findElement(By.xpath("//span[text()='IT Infrastructure']"));
				ac.moveToElement(element).build().perform();
				
				WebElement Developer=driver.findElement(By.xpath("//a[text()='Developers & DevOps']"));
				Developer.click();
				driver.navigate().back();
				driver.navigate().forward();
				
				String p= driver.findElement(By.xpath("//h1[@class=\"cp-page-title \"]")).getText();
				
 System.out.println("developer job "+ p);
	}

}
