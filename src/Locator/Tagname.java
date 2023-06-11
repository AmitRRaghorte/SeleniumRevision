package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
   
	
	public void m5 () throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		
		//1.Tagname
		WebElement un = driver.findElement (By.tagName("input"));
		un.sendKeys("8605091289");
	}
	public static void main (String [] args) throws InterruptedException
	{
		Tagname l = new Tagname ();
		l.m5();
	}
}
