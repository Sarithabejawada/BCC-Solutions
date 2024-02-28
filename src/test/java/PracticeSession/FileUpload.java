package PracticeSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class FileUpload {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver", 
			"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
    WebDriver driver = new ChromeDriver();
		
		
    	driver.get("https://webdriveruniversity.com/File-Upload/index.html");


		        // Fix the XPath expression by closing the square bracket properly
		        WebElement upload = driver.findElement(By.xpath("//input[@type = 'file']"));

		        // Provide the correct file path with escaped backslashes
		        upload.sendKeys("file:///C:/Users/Saritha/OneDrive/Desktop/Assignment%20-%201.pdf");

		        Thread.sleep(500);

		        WebElement submitButton = driver.findElement(By.xpath("//input[@id='submit-button']"));
		        submitButton.click();

		        Thread.sleep(500);

				


	}

}
