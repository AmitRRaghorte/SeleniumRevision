package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch11 implements BrowserCommonProperty1 {

	
	public void welcome() 
	{
		System.out.println ("Welcome to OranageHrm");
		
	}

	public void m5 () throws InterruptedException 
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("url");
		Thread.sleep(500);
		Driver.close ();
		
	}
	
	public void greet() 
	{
		System.out.println ("Visit Aagain");
		
	}

}
