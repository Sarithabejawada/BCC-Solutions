package Axis.Bccsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.makemytrip.com/");
				
				driver.manage().window().maximize();
				Thread.sleep(1000);
				RemoteWebElement Date = (RemoteWebElement) driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
				Date.click();
				Thread.sleep(1000);
				WebElement newDate = driver.findElement(By.xpath("//div[@class='DayPicker-Day'][@aria-label=\"Tue Feb 27 2024\"]"));
				
	}

}
