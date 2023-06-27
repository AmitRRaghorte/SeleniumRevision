package ActionClass_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_MoveTOElement {
	
	// how to move to drop down
	
	public void m5 () throws InterruptedException
	{
	   WebDriver Driver = new ChromeDriver ();
	   Driver.manage().window().maximize();
	   Driver.get("https://www.amazon.in/");
	   System.out.println ("Title is " + Driver.getTitle());
	   System.out.println ("Current url "+ Driver.getCurrentUrl());
	   
	   Thread.sleep(2000);
	   
	  WebElement lang = Driver.findElement(By.xpath("//div[text()='EN']"));
	  Actions act = new Actions (Driver);
	  act.moveToElement(lang).perform();
	  
	  Driver.close();


	}
	public static void main (String [] args) throws InterruptedException

	{

	   Example2_MoveTOElement e = new Example2_MoveTOElement ();
	   e.m5();

	}
}
