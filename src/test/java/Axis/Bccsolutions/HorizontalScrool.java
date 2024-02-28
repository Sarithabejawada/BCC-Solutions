package Axis.Bccsolutions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class HorizontalScrool {

	
		private static final String By = null;

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("Webdriver.chrome.driver", 
					"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					
					ChromeDriver driver = new ChromeDriver();
					
					((WebDriver) driver).get("https://www.facebook.com/login/%22);");
					
					((WebDriver) driver).manage().window().maximize();
					Thread.sleep(500);
					
				
					Javascript js = (Javascript)driver;

					  // vertical down scroll (x and y coordinates)

					  ((JavascriptExecutor) js).executeScript("window.scrollBy(0 , 800)", "");

					  // vertical up scroll (x and y coordinates)
					  ((JavascriptExecutor) js).executeScript("window.scrollBy(0 , -400)", "");

					  Thread.sleep(500);
					  // resizing of the window
					  // horizontal down scroll (x and y coordinates)
					  ((JavascriptExecutor) js).executeScript("window.scrollBy(200 , 0)", "");

					  // vertical up scroll (x and y coordinates)
					  ((JavascriptExecutor) js).executeScript("window.scrollBy(-300 , 0)", "");

					WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Meta © 2024')]"));
					((JavascriptExecutor) js).executeScript("arguments[0].scrollIntoView(true);", ele);




		}


		


	}


