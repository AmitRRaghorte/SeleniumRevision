package ActionClass_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_mouseDoubleClick {

	public void isha() {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement dc = Driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(Driver);
		act.moveToElement(dc).perform();

		// act.moveToElement(dc).perform();
		// act.doubleClick().perform();

		// act.moveToElement(dc).doubleClick().perform();

		act.doubleClick(dc).perform();

	}

	public static void main(String[] args) {
		Example5_mouseDoubleClick d = new Example5_mouseDoubleClick();
		d.isha();
	}
}
