package WebDriver_Method_Title_URL_Check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jio implements Generalisation_for_TitleUrl {

	public void launch1 () throws InterruptedException 
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get(url22);
		Thread.sleep (150);
		
		// Check Title
		System.out.println ("Page title is : " + Driver.getTitle());
		
		// To check url
		 String Url = Driver.getCurrentUrl();
		 System.out.println ("Current Url is:"+ Url);
		 Driver.close ();
		
	}
	
	public void greet ()
	{
		System.out.println ("Welcome to JIO");
	}
	public void data() 
	{
		System.out.println ("2 gb per day");
		
	}
	
	public void sms() 
	{
		System.out.println ("250 sms");
		
	}

	
}
