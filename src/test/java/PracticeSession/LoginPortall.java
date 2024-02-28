package PracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPortall {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(500);
		

		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,800)", "");
		
		js.executeScript("window.scrollBy(0,-400)", "");
		
		Thread.sleep(500);
		
		WebElement loginportal = driver.findElement(By.xpath("//a[@id = 'login-portal'][1]"));
		
		Thread.sleep(500);
		
		loginportal.click();
		
		Thread.sleep(500);
		
		WebElement username = driver.findElement(By.xpath("//input[@type = 'text'][@placeholder = 'Username']"));
		
		WebElement password = driver.findElement(By.xpath("//input[@id = 'password']["));
		
		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit'][@id = 'login-button']"));
		
		username.sendKeys("sarithabejawada");
		
		password.sendKeys("@1234");
		
		login.click();
		
		 Thread.sleep(500);
		 
		 
		
	}

}
