package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath_By_conatains {
	
	public void m5() throws InterruptedException 
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		Driver.findElement (By.xpath("(//input)[3]")).sendKeys("amit");
		Driver.findElement(By.xpath("(//input)[4]")).sendKeys("amit@1993");
		
		
		// A.With attribute Std Syntax : // tagName [contains(@attributename,'attributevalue')]
		   
		Driver.findElement(By.xpath("//button[ contains (@name,'login')]")).click();
		    
	    // B. With text functions std syntax : // tagName [contains (text(),'textvalue')]
	    Driver.findElement(By.xpath("//a [contains(text(),'Forgotten password?')]")).click();	
		
	}
	public static void main (String [] args) throws InterruptedException
	{
		Relative_Xpath_By_conatains r = new Relative_Xpath_By_conatains ();
		r.m5();
	}

}
