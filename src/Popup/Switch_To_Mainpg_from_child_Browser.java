package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Mainpg_from_child_Browser {

	public void m5() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// click on "NewTab" from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		// get child window ID
		Set<String> allIds = driver.getWindowHandles(); // {mainPageID, childWindowID}
		ArrayList<String> al = new ArrayList<String>(allIds); // {mainPageID(0), childWindowID(1)}

		// switch to child window
		driver.switchTo().window(al.get(1)); // String childWindowID

		// click on "Training" link from childWindow
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();

		Thread.sleep(2000);

		// switch to main page
		driver.switchTo().window(al.get(0));

		Thread.sleep(2000);

		// click on "NewWindow" from main page by new childwindow open
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		// if we want to handle second child window then again write
		//Set<String> allIds = driver.getWindowHandles(); // {mainPageID, childWindowID}
		//ArrayList<String> al = new ArrayList<String>(allIds); // {mainPageID(0), childWindowID(1)}
		//driver.switchTo().window(al.get(2)); // String childWindowID


	}

	public static void main(String[] args) throws InterruptedException {
		Switch_To_Mainpg_from_child_Browser s = new Switch_To_Mainpg_from_child_Browser();
		s.m5();
	}
}
