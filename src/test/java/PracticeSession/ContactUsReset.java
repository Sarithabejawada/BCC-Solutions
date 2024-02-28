package PracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ContactUsReset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverDecorator driver = new WebDriverDecorator();
		((Object) driver).get("https://webdriveruniversity.com/Contact-Us/contactus.html");

		WebElement firstnameInput = ((By) driver).findElement((SearchContext) By.xpath("//input[@name='first_name']"));
		WebElement lastnameInput = ((SearchContext) driver).findElement(By.xpath("//input[@name='last_name']"));
		WebElement emailInput = ((SearchContext) driver).findElement(By.xpath("//input[@name='email']"));
		WebElement commentInput = ((By) driver).findElement((SearchContext) By.xpath("//textarea[@name='message']"));

		WebElement resetButton = ((SearchContext) driver).findElement(By.xpath("//input[@class='contact_button'][1]"));

		firstnameInput.sendKeys("santosh");
		lastnameInput.sendKeys("kotteti");
		emailInput.sendKeys("Santoshkumarkotteti@gmail.com");
		commentInput.sendKeys("This is a comment.");
		resetButton.click();
		Thread.sleep(2000);
		driver.wait();

	}

}
