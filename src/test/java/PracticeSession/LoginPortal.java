package PracticeSession;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPortal {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(500);
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//vertical down scroll(x and y coordinates)
		
		js.executeScript("window.scrollBy(0,800)", "");
		
		//vertical up scroll(x and y coordinates)
		
		js.executeScript("window.scrollBy(0,-400)", "");
		
		Thread.sleep(500);
		
		WebElement loginportal = driver.findElement(By.xpath("//a[@id = 'login-portal'][1]"));
		
		Thread.sleep(500);
		
		loginportal.click();
		
		Thread.sleep(500);
		
		WebElement username = driver.findElement(By.xpath("//input[@type = 'text'][@placeholder = 'Username']"));
		
		Actions builder = new Actions(driver);
Action serisofact = (Action) builder.moveToElement(username).click().keyDown(username, Keys.SHIFT).sendKeys(username, "RaveenaReddy").build();
		
		((Actions) serisofact).perform(); 
		
        Thread.sleep(500);
		
		WebElement password = driver.findElement(By.xpath("//input[@id = 'password']["));
		
		Actions builder2 = new Actions(driver);
		
		Action serisofact2 = (Action) builder2.moveToElement(password).click().keyDown(password, Keys.SHIFT).sendKeys(password, "@12345").build();
		
		((Actions) serisofact2).perform();
		
		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit'][@id = 'login-button']"));
		
		login.click();
		
		 Thread.sleep(500);


				
				


	}			

	}
