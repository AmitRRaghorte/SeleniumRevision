package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

public void M5 () throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(200);
		
		// Locator -- ID
		WebElement un = driver.findElement (By.id("email"));
		un.sendKeys("8605091289");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("amit@1993");
	}
	public static void main (String [] args) throws InterruptedException
	{
		Tagname l = new Tagname ();
		l.m5();
	}
}

