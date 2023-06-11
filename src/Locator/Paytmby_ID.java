package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytmby_ID {
	
	public void m5()
	{
		WebDriver driver = new ChromeDriver ();
	    driver.manage().window().maximize();
	    driver.get("https://accounts.paytm.com/oauth2/v3/authorize?theme=mp-html5&minKyc=true&isSignup=false&redirect_uri=https://www.paytm.com&is_verification_excluded=false&client_id=noLoginMinKyc&type=web_server&scope=paytm&response_type=code#!/login");
	
	    WebElement un = driver.findElement(By.id("input_2"));
	    un.sendKeys("amit1993");
    }
	
	public static void main (String [] args)
	{
		Paytmby_ID  c = new Paytmby_ID ();
		c.m5();
	}

}
