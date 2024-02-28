package Axis.Bccsolutions;

import org.bouncycastle.jcajce.provider.keystore.BC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://the-internet.herokuapp.com/iframe");
				
				driver.manage().window().maximize();
				 
				Thread.sleep(500);
				
				WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
				driver.switchTo().frame(frame1);
				WebElement content = driver.findElement(By.id("tinymce"));
				content.clear();
				content.sendKeys("hello world");





		 
				
}
}