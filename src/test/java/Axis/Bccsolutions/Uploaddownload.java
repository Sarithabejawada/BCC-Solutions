package Axis.Bccsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploaddownload {

	public static void main(String[] args) throws InterruptedException {
		
		
			
			System.setProperty("Webdriver.chrome.driver", 
			"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			driver.manage().window().maximize();
			
			WebElement upload = (WebElement) driver.findElements(By.xpath("//input[@name = 'upload']"));
			upload.sendKeys("file:///C:/Users/Saritha/OneDrive/Desktop/B.saritha.pdf");
			Thread.sleep(500);
			
			
				 WebElement download = driver.findElement(By.xpath("//input[@name ='download']"));

			 
							download.click();
							Thread.sleep(500);
							/*
							 * File file = new File("C:\\Users\\Harsha Patil\\Downloads\\Resume.pdf");
							 * 
							 * if (file.exists()) { System.out.println("The file exists."); } else {
							 * System.out.println("The file does not exist."); }
							 * 
							 */



			 
			 
				}
			 
			
					
		}

	


