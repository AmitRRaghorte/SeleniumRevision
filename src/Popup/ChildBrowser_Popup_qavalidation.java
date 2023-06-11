package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_Popup_qavalidation {

	
	public void m5()
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://skpatro.github.io/demo/links/");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// click on new Tab
		Driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get id
		Set <String> allids = Driver.getWindowHandles(); // return id of main page & chiled browser in table format
		ArrayList<String> a1 = new ArrayList<String> (allids);
		
		// Switch to child window
		Driver.switchTo().window(a1.get(1));
		
		//click on "WebDdriver10" lINK FROM child browser
		Driver.findElement(By.xpath("//span[text()='WebdriverIO']")).click();
		
		
	}
	public static void main (String [] args)
	{
		 ChildBrowser_Popup_qavalidation c = new  ChildBrowser_Popup_qavalidation ();
		 c.m5();
	}
}
