package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TO locate webelement of LINK we always used Xpath by textFunction
public class Relative_Xpath_By_TextFunction {

	public void m5() throws InterruptedException
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get ("https://www.facebook.com/");
		  
		System.out.println ("Title is : " + Driver.getTitle());
		System.out.println ("Current URL IS : " + Driver.getCurrentUrl());
		
		// Std Syntax ://tagName [text() = 'textValue' ]
		Driver.findElement(By.xpath("//a[text='Forgotten password?']")).click();
		
		
}
	public static void main (String [] args) throws InterruptedException
	{
		Relative_Xpath_By_TextFunction r = new Relative_Xpath_By_TextFunction ();
		r.m5();
	}
}
