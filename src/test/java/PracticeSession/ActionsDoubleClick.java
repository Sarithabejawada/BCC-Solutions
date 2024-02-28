package PracticeSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ActionsDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement doubleClick = driver.findElement(By.xpath("//div[@id = 'double-click']"));
		
		Actions builder = new Actions(driver);
		
		Thread.sleep(1000);
		
		builder.doubleClick(doubleClick).perform(); 
        
        Alert alt = driver.switchTo().alert();
        
        alt.accept();

				

	}

}
