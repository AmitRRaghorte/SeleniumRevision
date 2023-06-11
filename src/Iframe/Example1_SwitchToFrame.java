package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SwitchToFrame {
	
	public void m5()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		// 4 Types to switch to iframe from main pg
		
		//driver.switchTo().frame("iframeResult"); // String id
		//driver.switchTo().frame("iframeResult"); // String Framename
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));// frame webelement
		//driver.switchTo().frame(); // frame index
		
		
		// click on me dispaly date button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
	}
     public static void main (String [] args)
     {
    	 Example1_SwitchToFrame e = new Example1_SwitchToFrame ();
    	 e.m5();
     }
}
