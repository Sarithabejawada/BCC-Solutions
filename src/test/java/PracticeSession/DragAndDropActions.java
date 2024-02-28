package PracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class DragAndDropActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
WebDriverDecorator driver = new WebDriverDecorator();
		
		((WebDriver) driver).get("https://webdriveruniversity.com/Actions/index.html#");
		
		((WebDriver) driver).manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement drag = ((WebElement) driver).findElement(By.xpath("//div[@id = 'draggable']"));
		
		WebElement drop = ((WebElement) driver).findElement(By.xpath("//div[@id = 'droppable']"));
		
		Actions builder = new Actions((WebDriver) driver);
		
		builder.dragAndDrop(drag, drop).perform();

	}

}
