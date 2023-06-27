package ActionClass_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_mouseLeft_Click {

	public void m5() throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
        // click on close btn
		Driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement cart = Driver.findElement(By.xpath("//span[text()='Cart']"));
		Actions act = new Actions (Driver);
		act.moveToElement(cart).perform();
		
		// 1st approach
		//act.click().perform();
		
		// 2nd approach
		act.moveToElement(cart).click().perform();
		
		// 3rd approach
		act.click(cart).perform();
		
		Driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		Example4_mouseLeft_Click j = new Example4_mouseLeft_Click();
		j.m5();
	}

}
