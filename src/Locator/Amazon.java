package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public void m5 () throws InterruptedException
	{
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in/");
		Thread.sleep (500);
		System.out.println ("Title is : "+ Driver.getTitle());
		System.out.println ("Current Url is : " +Driver.getCurrentUrl());
		
		
		// Xpath by text function
		//WebElement aboutus = Driver.findElement(By.xpath("//a[text()='About Us']"));
		//aboutus.click();
		//Driver.navigate().back();
		
		// xpath by Attribute (Amazon searchboc)
		//WebElement search = Driver.findElement(By.xpath("//input [@id=\"twotabsearchtextbox\"]"));
		//search.click();
		
		// (amazon logo)
		//WebElement amazonlogo =Driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		//amazonlogo.click();
		
		//Abebook
		//WebElement abebook = Driver.findElement(By.xpath("//span[@class='navFooterDescText']"));
		//abebook.click();
		
		//WebElement amazonwebservice =Driver.findElement(By.xpath("//a[text()='Amazon Web Services']"));
		//amazonwebservice.click();
		
		//WebElement imdb = Driver.findElement(By.xpath("//a[text ()='IMDb']"));
		//imdb.click();
		
		// Audible
		WebElement audible = Driver.findElement(By.xpath("//span[text()='Audio Books']"));
		audible.click();
		
		// DPreview
		//WebElement dpreview = Driver.findElement(By.xpath("//a[text ()='DPReview']"));
		//dpreview.click();
		
		//Shobop
		//WebElement shopbop = Driver.findElement(By.xpath("//a[text ()='Shopbop']"));
		//shopbop.click();
		
		// Amazon business 
		//WebElement amazonbusiness = Driver.findElement(By.xpath("//span[text() = 'Everything For']"));
		//amazonbusiness.click();
		
		//PrimeNow
		//WebElement primenow = Driver.findElement(By.xpath("//a[text ()='Prime Now']"));
		//primenow.click();
		
		//amazon prime music
		//WebElement primemusic = Driver.findElement(By.xpath("//a[text()='Amazon Prime Music']"));
		//primemusic.click();
		//Driver.close();
	}
    public static void main (String [] args) throws InterruptedException
    {
    	 Amazon a = new  Amazon ();
    	 a.m5();
    }
}
