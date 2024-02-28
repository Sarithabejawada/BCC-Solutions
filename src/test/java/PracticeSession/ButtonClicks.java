package PracticeSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ButtonClicks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
	    WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();		
		Thread.sleep(1000);		
		WebElement infloalt1 = driver.findElement(By.xpath("//span[@id = 'button1']"));		
		infloalt1.click();		
        Thread.sleep(1000);        
        Alert alt = driver.switchTo().alert();        
        alt.dismiss();        
        WebElement infloalt2 = driver.findElement(By.cssSelector("#button2"));		
		infloalt2.click();		
        Thread.sleep(1000);        
        Alert alt2 = driver.switchTo().alert();        
        alt2.dismiss();		
        Thread.sleep(500);        
        WebElement infloalt3 = driver.findElement(By.id("button3"));		
		infloalt3.click();		
        Thread.sleep(1000);       
        Alert alt3 = driver.switchTo().alert();        
        alt3.dismiss();		
        Thread.sleep(1000);
			}
		

	}


