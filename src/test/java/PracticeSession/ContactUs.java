package PracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
				
				driver.manage().window().maximize();
				 
				Thread.sleep(500);
				
				WebElement firstname = driver.findElement(By.xpath("//input[@name = 'first_name']"));
				
			       WebElement lastname = driver.findElement(By.xpath("//input[@name = 'last_name']"));
					

					
			        WebElement email = driver.findElement(By.xpath("//input[@name = 'last_name']"));
			        
			        WebElement commentInput = driver.findElement(By.xpath("//textarea[@name='message']"));
					WebElement submitButton = driver.findElement(By.xpath("//input[@class='contact_button'][2]"));

			        
			        firstname.sendKeys("saritha");
			        lastname.sendKeys("bejawada");
			        
			        email.sendKeys("sarithabejawada@gmail.com");
			        commentInput.sendKeys("This is a comment.");
			        submitButton.click();
			        
			        Thread.sleep(500);
			        driver.quit();

					}


	           }			

	


