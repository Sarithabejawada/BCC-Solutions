package Axis.Bccsolutions;

import javax.swing.JList;

import org.bouncycastle.its.ITSValidityPeriod.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class WebTable {

	private static Object text;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://the-internet.herokuapp.com/tables");
				
				driver.manage().window().maximize();
				 
				Thread.sleep(500);
				
				
				
			//FindWebElement rows present 
				
				List<WebElement> rowno = (List<WebElement>) driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
				int rowcount = rowno.size();
				System.out.println(rowcount);
				
				//Find the no of columns
				List<WebElement> colno = (List<WebElement>) driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
				
				int colcount = colno.size();
				
				System.out.println(colcount);
				
				
		
				
				// fetch the cell data from the particular cell
				
				List<WebElement> celldata = (List<WebElement>) driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
				
				String excpectedtext = "tconway@earthlink.net";
				
				if(text.equals(excpectedtext)) {
					System.out.println("The celldata is correct");
					
				}else {
					System.out.println("The cell data is wrong");
				}
				
				
				
		 

	}

}
