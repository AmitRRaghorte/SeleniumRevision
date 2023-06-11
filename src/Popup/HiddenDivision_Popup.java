package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Popup {

	public void m5() 
	{
       WebDriver Driver = new ChromeDriver();
       Driver.manage().window().maximize();
       Driver.get("https://www.flipkart.com/");
       Driver.getTitle();
       Driver.getCurrentUrl();
       
       //WebElement login = Driver.findElement(By.xpath("//a[text()='Login']"));
       //login.click();
       
        Driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("popup handled");
       
       //Driver.close();
	}

	public static void main(String[] args) {
	HiddenDivision_Popup h = new HiddenDivision_Popup();
		h.m5();
	}
}
