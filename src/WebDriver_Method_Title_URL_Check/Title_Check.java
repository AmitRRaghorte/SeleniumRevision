package WebDriver_Method_Title_URL_Check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// How to get current title of page
//URL :https://www.amazon.in/
//Title : Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in

public class Title_Check {
	
	public void title () throws InterruptedException
	{
	// Step 1 : Launch Browser
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in/");
		Thread.sleep (500);
		
		
  // Step 2 : getTitle() to obtain page title
		System.out.println ("Page title is : " + Driver.getTitle());
		Driver.close();
	}

	public static void main (String [] args ) throws InterruptedException
	{
		Title_Check t = new Title_Check ();
		t.title();
	}
}
