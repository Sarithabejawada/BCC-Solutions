package Axis.Bccsolutions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;



public class TakeScreenShortEg {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("Webdriver.chrome.driver", 
					"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://www.makemytrip.com/");
					
					driver.manage().window().maximize();
					Thread.sleep(1000);
		
					// Take screen shot class and getscreenshortAs - method
					
					Filter f = (TakeScreenshot) driver).getScreenshots(output.FILE);
					FileUtils.copyFile(f, new File("C:\\Users\\Saritha\\OneDrive\\Pictures\\Screenshots\\Screenshot"));
					System.out.println("The scrrenshot is captured");
					

	}

}
