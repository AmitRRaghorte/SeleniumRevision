package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_popup1 {

	public void m5() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();

		// when switch from pg1 to pg2 then we need to provide implicitwait ao that pg2
		// wil get load successfully
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// click on "new tab" from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		// get chiled id
		Set<String> allIds = driver.getWindowHandles(); // {mainPageID, childWindowID}
		ArrayList<String> al = new ArrayList<String>(allIds); // {mainPageID(0), childWindowID(1)}

		// switch to child window
		driver.switchTo().window(al.get(1)); // String childWindowID

		// click on "Training-link " from child browser
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
	}

	public static void main(String[] args) {
		ChildBrowser_popup1 c = new ChildBrowser_popup1();
		c.m5();
	}
}
