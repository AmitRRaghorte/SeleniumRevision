package Companyway;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implementation_class_Popup_alert implements CommonProperties_Pop_up_alert {

	public void welcome() {
		System.out.println("Automation Demo site");

	}

	public void alert() {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(url);
		System.out.println("Title of current Window" + Driver.getTitle());
		System.out.println("Current URL is :" + Driver.getCurrentUrl());
		
		// Alert withOK !!
		Driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Driver.findElement(By.xpath("   //button[@class='btn btn-danger']")).click();
		String text = Driver.switchTo().alert().getText();
		System.out.println(text);
		Driver.switchTo().alert().accept();

		// Alert with ok cancel
		Driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		// Driver.findElement(By.xpath("//p[text()='You pressed Ok']"));
		String textr = Driver.switchTo().alert().getText();
		System.out.println(textr);
		Driver.switchTo().alert().dismiss();
		
		//Alert with TextBox

		Driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		String texted = Driver.switchTo().alert().getText();
		System.out.println (texted);
		Driver.switchTo().alert().sendKeys("Hello ,Amit Automation Test Engineer");
		Driver.switchTo().alert().accept();

		Driver.close();
	}

	public void test() {
		System.out.println("Alert Pop-up successfully handled");

	}

}
