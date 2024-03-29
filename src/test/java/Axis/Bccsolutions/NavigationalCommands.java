package Axis.Bccsolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				// get URL
				
				driver.get("https://automationexercise.com/");
				
			   //Refresh page
				driver.navigate().refresh();
				
				//Navigate forwards in browser history
				
				driver.navigate().forward();
				Thread.sleep(500);
				
				//Navigate backward in browser history
				
				driver.navigate().back();
				Thread.sleep(500);
				
				//Refresh page 
				driver.navigate().refresh();
				
				
				//driver.close();

	}

}
