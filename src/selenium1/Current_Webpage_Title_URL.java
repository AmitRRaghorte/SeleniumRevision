package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Current Title : OrangeHRM
//opensource-demo.orangehrmlive.com/web/index.php/auth/login
public class Current_Webpage_Title_URL {
	
	static WebDriver w ;
	
	public void currenttitleurl () throws InterruptedException
	{
		w = new ChromeDriver ();
		w.manage().window().maximize();
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep (200);
		
		// to get title
		System.out.println ("Current Title : " + w.getTitle());
		
		// get url
		System.out.println (""  + w.getCurrentUrl());
		
		w.close();
		
	}
	
	public static void main (String [] args) throws InterruptedException
	{
		Current_Webpage_Title_URL  ctu = new Current_Webpage_Title_URL  ();
		ctu.currenttitleurl();
	}

}
