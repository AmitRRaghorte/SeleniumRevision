package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_AlertPopup {

	public void m5() {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demo.guru99.com/test/delete_customer.php");

		WebElement customerid = Driver.findElement(By.xpath("//input[@name='cusid']"));
		customerid.sendKeys("abc");
		WebElement submit = Driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();

		// to handle alert popup we 1st need to focus of selenium from mainpage to popup
		// Switch to alert pop-up
		
		Alert alt = Driver.switchTo().alert();

		//1. To get text from alert popup
		String text = alt.getText();  //String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		//2.click on cancel btn from alert popup
		//alt.dismiss();
		
		//3.click on "OK" btn from 1st alert popup
		alt.accept();
		
		//4. click on "OK" btn from 2nd alert popup
		alt.accept();

		//Driver.close();

	}

	public static void main(String[] args) {
		Example1_AlertPopup a = new Example1_AlertPopup();
		a.m5();
	}
}
