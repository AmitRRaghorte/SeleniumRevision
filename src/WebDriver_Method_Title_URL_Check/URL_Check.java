package WebDriver_Method_Title_URL_Check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to get current url of webpage using selenium webdriver

public class URL_Check {
	
	
	public void url () throws InterruptedException
	{
	  // Step 1 : Launch Browser
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in/");
		Thread.sleep (300);
	
  
	 // Step 2 : Get  url
		
		 String strUrl = Driver.getCurrentUrl();
		 System.out.println ("Current Url is:"+ strUrl);
		 Driver.close ();
		
	}
    public static void main (String [] args) throws InterruptedException
    {
    	URL_Check u = new URL_Check ();
    	u.url ();
    }
}
