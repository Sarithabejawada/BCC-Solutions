package Axis.Bccsolutions;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class KeyBoardEvents {

	private static final String Keys = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/login/");
				
				Thread.sleep(500);
				
				RemoteWebElement email = (RemoteWebElement) driver.findElement(By.xpath("//input[@id='email']"));
				Actions builder = new Actions(driver);
				// action class to be used when we need to do  series of actions together.
				Action seriesofact = (Action) builder.moveToElement(email).click().
						keyDown(email, Keys).sendKeys(email, "SARITHA").build();
				((Actions) seriesofact).perform();


 
 
	}
 

				
	}


