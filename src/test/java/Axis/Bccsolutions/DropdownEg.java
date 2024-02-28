package Axis.Bccsolutions;

import javax.swing.text.html.HTMLDocument.BlockElement;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	private static final String By = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.dummypoint.com/seleniumtemplate.html");
				
				driver.manage().window().maximize();
				 
				Thread.sleep(500);
		 
				RemoteWebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
				 
				Select sel = new Select(dropdown);
		 
				// select by visible text
		 
				sel.selectByVisibleText("Option3");
		 
				Thread.sleep(500);
		 
				// select by value
		 
				sel.selectByValue("OptionFive");
		 
				// select by indexing
		 
				sel.selectByIndex(1);
		 
			}
		 
		}