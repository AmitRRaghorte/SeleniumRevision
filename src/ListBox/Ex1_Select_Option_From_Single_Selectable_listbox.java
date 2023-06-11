package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_Select_Option_From_Single_Selectable_listbox {

	public void m5() throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");

		Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);

		// according to tution teaching we can handle list box whose tagname is select
		// Step to handle ListBox

		// Step1: Identify List box and store it into object.

		WebElement day = Driver.findElement(By.xpath("//select[@id='day']"));
		
		
		// Step 2 : Object of select class and store the obj.of listbox into the
		// constructor of select class

		Select s = new Select(day);
		
		// Step 3 : used select class method
		//s.selectByVisibleText();
		s.selectByValue("5");
		//s.selectByIndex();

	}

	public static void main(String [] args) throws InterruptedException {
		Ex1_Select_Option_From_Single_Selectable_listbox e = new Ex1_Select_Option_From_Single_Selectable_listbox();
		e.m5();
	}
}
