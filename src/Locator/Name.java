package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	
	
	public void m5 ()
	{
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.name("email"));
		un.sendKeys("amitraghorte7@gmail.com");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("amit@1993");
	}
	
	public static void main (String [] args)
	{
		Name l = new Name ();
		l.m5();
	}

}
