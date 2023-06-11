package WebDriver_Method_Title_URL_Check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airtel implements Generalisation_for_TitleUrl{
  static WebDriver a;
	public void launch () throws InterruptedException 
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get(url1);
		Thread.sleep (150);
		
		// Check Title
		System.out.println ("Page title is : " + Driver.getTitle());
		
		// To check url
		 String Url = Driver.getCurrentUrl();
		 System.out.println ("Current Url is:"+ Url);
		 Driver.close ();
		
		
	}
	public void welcome () 
	{
		System.out.println ("Welcome to JIO");
	}
	
	public void data() 
	{
		System.out.println ("1.5 gb per day");
	}

	public void sms() 
	{
		System.out.println ("300 sms per day");
	}

}
