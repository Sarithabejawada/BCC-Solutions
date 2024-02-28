package Axis.Bccsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			System.setProperty("Webdriver.chrome.driver", 
					"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://the-internet.herokuapp.com/drag_and_drop");
					
					Thread.sleep(1000);
					
					// drag and drop
					WebElement	 src = driver.findElement(By.xpath("//div[@id='columb-a']"));
					WebElement	 dest = driver.findElement(By.xpath("//div[@id='columb-b']"));
					
					Actions builder = new Actions(driver);
					builder.dragAndDrop(src, dest).perform();
					System.out.println("The item dragges and dropped");
	}
	}


