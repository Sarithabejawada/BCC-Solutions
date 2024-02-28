package PracticeSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().fullscreen();
		
       Thread.sleep(1000);
		
		List <WebElement> allradio = driver.findElements(By.xpath("//input[@type= 'radio']"));

		for (WebElement wb : allradio) {
			
			wb.click();
			
			Thread.sleep(500);
			
		}

	}


	}


