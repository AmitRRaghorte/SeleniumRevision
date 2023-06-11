package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath_By_Index {
	
	public void m5() throws InterruptedException
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get ("https://www.facebook.com/");
		  
		System.out.println ("Title is : " + Driver.getTitle());
		System.out.println ("Current URL IS : " + Driver.getCurrentUrl());
		  
		// 1.Normal xpath 
		//Std syntax = // Tagname
	    Driver.findElement(By.xpath("// ")).sendKeys("amitraghorte7@gmail.com");
	    
	    //2relative Xpath by index
	    // Std Syntax = //Tagname [index]
	    
	    Driver.findElement(By.xpath("//input [3]")).sendKeys("amitraghorte7@gmail.com");
	    
	    //3.normal/regular relative xpath with signature
	    //Std Syntax : // (tagName)[index]
	    Driver.findElement (By.xpath("(//input)[3]")).sendKeys("amit");
	    Driver.findElement(By.xpath("(//input)[4]")).sendKeys("amit@1993");
	    Thread.sleep(100);
	    Driver.close();
	    
	    
	   
		
	}
    public static void main (String [] args) throws InterruptedException
    {
    	Relative_Xpath_By_Index a = new Relative_Xpath_By_Index ();
    	a.m5();
    	
    }
}
