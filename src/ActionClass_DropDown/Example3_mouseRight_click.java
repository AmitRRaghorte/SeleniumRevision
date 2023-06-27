package ActionClass_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_mouseRight_click {

	public void m5() throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Thread.sleep(2000);

		WebElement right = Driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(Driver);
		act.moveToElement(right).perform();

		// 1st approach to right click
		//act.contextClick().perform();
		
		// 2nd approach
		//act.moveToElement(right).contextClick().perform();
		
		// 3rd approach to right click
		act.contextClick(right).perform();
		
		Driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		Example3_mouseRight_click e = new Example3_mouseRight_click();
		e.m5();
	}
}
