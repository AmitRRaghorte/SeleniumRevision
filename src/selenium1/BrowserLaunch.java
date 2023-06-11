package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	
	public void m5 () throws InterruptedException
	{
		//System.setProperty ("webdriver.chrome.driver","E:\\JAVA\\SETUP\\Browser\\ChromeDriver 113\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver ();
		d.manage().window().maximize();
		d.get("https://gorest.co.in/");
		Thread.sleep(500);
		d.close();
	}
	
	public static void main (String [] args) throws InterruptedException
	{
		BrowserLaunch b = new BrowserLaunch ();
		b.m5();
	}
}
