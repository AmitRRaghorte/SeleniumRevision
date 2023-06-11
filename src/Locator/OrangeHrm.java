package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Find locator and login
public class OrangeHrm {
    static WebDriver driver ;
	
    public void m5() throws InterruptedException
	{
	  driver= new ChromeDriver ();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  System.out.println ("Title is : " + driver.getTitle());
	  System.out.println ("Current URL IS : " + driver.getCurrentUrl());
	  Thread.sleep(100);
	  
	 WebElement un = driver.findElement(By.xpath("//div/input[@name='txtUsername']"));
	 un.sendKeys("Admin");
	 
	 WebElement pwd = driver.findElement(By.xpath("//div/input[@name='txtPassword']"));
	 pwd.sendKeys("admin123");
	 
	// WebElement login = driver.findElement(By.xpath(""));
	// login.click();
	  //driver.close();
	}
	public static void main (String [] args) throws InterruptedException
	{
		OrangeHrm h = new OrangeHrm ();
		h.m5();
	}
}
