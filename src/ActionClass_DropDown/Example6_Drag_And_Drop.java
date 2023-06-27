package ActionClass_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_Drag_And_Drop {

	public void m5() throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demo.guru99.com/test/drag_drop.html");

		Thread.sleep(2000);
		// step 1
		WebElement srcEle = Driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destEle = Driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));

		// Step 2
		Actions act = new Actions(Driver);

		// Step 3
		act.dragAndDrop(srcEle,destEle).perform();
		
		// if we want Drag - Hold - drop then used below method
		//act.moveToElement(srcEle).clickAndHold().moveToElement(destEle).release().perform();

	}

	public static void main(String[] args) throws InterruptedException {
		Example6_Drag_And_Drop v = new Example6_Drag_And_Drop();
		v.m5();
	}

}
