package PracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerEg {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(500);
		
		
	 // Click on the date input field to open the date picker
		
		  WebElement dateInput = driver.findElement(By.xpath("//div[@id = 'datepicker'] "));
		  dateInput.click();
          Thread.sleep(500);

		        
		  WebElement selectedDate = driver.findElement(By.xpath("//td[contains(text(),'11')]"));
		  selectedDate.click();
		  Thread.sleep(500);

		  // Close the browser
		        driver.quit();


	}

}
