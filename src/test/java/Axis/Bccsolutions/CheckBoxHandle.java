package Axis.Bccsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class CheckBoxHandle {

	public static void main(String[] args) {
		
		
			
			System.setProperty("Webdriver.chrome.driver", 
			"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/checkboxes");
			
		
		RemoteWebElement chkbox = (RemoteWebElement) driver.findElement(By.xpath("(//input[@type= 'checkbox'])[1])"));
		chkbox.click();
		
			

		}

	}


