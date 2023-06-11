package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextgenAI_Alert_popup {

	public void m5 ()
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		System.out.println ("Title is "+Driver.getTitle());
		System.out.println("Current url"+Driver.getCurrentUrl());
		
		WebElement alert = Driver.findElement(By.xpath("//button[@name='alertbox']"));
		alert.click();
		String text=Driver.switchTo().alert().getText(); 
		System.out.println (text);
		Driver.switchTo().alert().accept();
		
		WebElement confirmation =Driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		confirmation.click();
		String textt = Driver.switchTo().alert().getText();
		System.out.println (textt);
		Driver.switchTo().alert().dismiss();
		
		WebElement prompt = Driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		prompt.click();
		String tex =Driver.switchTo().alert().getText();
		System.out.println(tex);
		Driver.switchTo().alert().sendKeys("Yes automation is fun");
		Driver.switchTo().alert().dismiss();
		
		
		Driver.close();
		
	}
	public static void main (String [] args)
	{
		NextgenAI_Alert_popup n = new NextgenAI_Alert_popup ();
		n.m5();
	}
}
