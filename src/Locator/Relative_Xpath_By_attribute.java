package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath_By_attribute {
	
	public void m5() throws InterruptedException
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get ("https://www.facebook.com/");
		  
		System.out.println ("Title is : " + Driver.getTitle());
		System.out.println ("Current URL IS : " + Driver.getCurrentUrl());
		
		// Std Syntax : //tagName [@Attributename ='Attributevalue']
		Driver.findElement (By.xpath("//input [@id='email']")).sendKeys("amit");
	}
	
	public static void main (String [] args) throws InterruptedException
	{
		Relative_Xpath_By_attribute r = new Relative_Xpath_By_attribute ();
		r.m5();
	}
}
