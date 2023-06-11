package Iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_iframe {
	
	public void m5 ()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
	}
	public static void main (String[] args)
	{
		P1_iframe p = new P1_iframe ();
		p.m5();
	}

}
