package Companyway;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implementation_Class_Fb implements CommonProperty{

	public static WebDriver d ;
	
	public void welcome() 
	{
		System.out.println ("Welcome to Facebook ");
	}
	
	public void chromeLaunch() 
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get(url1);
		System.out.println ("Title is  : "+ Driver.getTitle());
		System.out.println ("URL IS : " + Driver.getCurrentUrl());
		
		
		WebElement un=Driver.findElement(By.id("email"));
		un.sendKeys("amitraghorte7@gmil.com");
		
		WebElement pwd = Driver.findElement(By.id("pass"));
		pwd.sendKeys("amit@1993");
    }

	public void visitmsg() 
	{
		System.out.println ("Thanks for visit ");
		
	}

}
