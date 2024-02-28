package Axis.Bccsolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		
			
			System.setProperty("Webdriver.chrome.driver", 
			"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			// get URL
			
			driver.get("https://automationexercise.com/");
			
			// get page title
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			// get currentURL
			
            String CurrentUrl = driver.getCurrentUrl();
			
			System.out.println(CurrentUrl);
			
			// get page source code
			
            String pagesource = driver.getPageSource();
			
			System.out.println(pagesource);
			
			//close () - to close the current browser session
			
			driver.close();
			
			}
}


