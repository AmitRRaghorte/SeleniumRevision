package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_attritbute {

		
	
	public void m5 () throws InterruptedException
	{

		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("http://localhost/login.do");
		//Driver.get("https://www.facebook.com/");
		Thread.sleep(300);
		
	   //Driver.findElement(By.xpath("")).sendKeys("Admin"); //tagname [index]
	  // Driver.findElement(By.xpath("")).sendKeys("Admin"); //tagname [@attribute,'attributevalue']
	   //Driver.findElement(By.xpath("")).sendKeys("Admin"); //tagname [contains(@attribute,'attributevalue')]
	   Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin"); // tagname [text()='textvalue']
	   
	}
	
	public static void main (String [] args) throws InterruptedException
	{
		Xpath_attritbute x = new Xpath_attritbute ();
		x.m5();
	}

}
