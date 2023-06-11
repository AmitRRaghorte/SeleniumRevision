package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartialLinkText {
	
	public void m5 ()
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://en-gb.facebook.com/");
		
		 // LinkText
		 Driver.findElement(By.linkText("Forgotten password?")).click();
		 
		 // Partial LinkText
		 Driver.findElement(By.partialLinkText("ten pa")).click();
		 Driver.close();
	}
    public static void main (String [] args)
    {
    	LinkText_PartialLinkText l = new LinkText_PartialLinkText ();
    	l.m5();
    }
}
