package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_index {

	
	public void m5 () throws InterruptedException
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		//Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.get("http://localhost/login.do");
		Thread.sleep(300);
		
		WebElement un = Driver.findElement(By.xpath("//input[3]"));
		//WebElement un = Driver.findElement(By.id("username"));
		un.sendKeys("Admin");
	}
	public static void main (String [] args) throws InterruptedException 
	{
		Xpath_index a =new Xpath_index ();
		a.m5();
	}
}
