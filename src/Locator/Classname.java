package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {
	
	// in classname locator we provide attribute value of class
	public void m5()
	{
	  WebDriver Driver = new ChromeDriver ();
	  Driver.manage().window().maximize();
	  Driver.get("https://www.facebook.com/");
	  
	  WebElement un = Driver.findElement(By.className("inputtext _55r1 _6luy"));
	  un.sendKeys("amitraghorte7@gmail.com");
	}
    public static void main (String [] args)
    {
    	Classname c = new Classname ();
    	c.m5();
    	
    }
}
