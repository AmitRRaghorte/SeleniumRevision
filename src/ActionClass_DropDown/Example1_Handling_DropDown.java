package ActionClass_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_Handling_DropDown {

	public void m5() throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);

		// click on close button on flipkart
		Driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);

		// Step 1 : identify element and store it into Webelement by creating object of element
		// : for this eg .we have 'login' element/dropdown
		
		WebElement login = Driver.findElement(By.xpath("//a[text()='Login']"));

		// Step 2 : Create obj. of action class and store webdriver/driver into the
		// constructor of action class
		
		Actions act = new Actions(Driver);

		// Step 3 : use method to move mouse on dropdown element
		
		act.moveToElement(login).perform();

		// click on wishlist element
		Driver.findElement(By.xpath("//div[text()='Wishlist']")).click();

	}

	public static void main(String[] args) throws InterruptedException {
		Example1_Handling_DropDown e = new Example1_Handling_DropDown();
		e.m5();
	}

}
