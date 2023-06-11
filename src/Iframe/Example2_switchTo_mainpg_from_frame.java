package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_switchTo_mainpg_from_frame {

	public void m5() {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		// Switch focus of selenium from main pg to iframe
		Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='iframeResult']")));

		// click on me display button
		Driver.findElement(By.xpath("//button[@type='button']")).click();

		// Switch to main page from iframe
		// Driver.switchTo().parentFrame(); // child iframe to parent iframe (ifrme to
		// iframe)
		Driver.switchTo().defaultContent(); // iframe to main page

		Driver.findElement(By.xpath("//a[@id='menuButton']")).click();

	}

	public static void main(String[] args) {
		Example2_switchTo_mainpg_from_frame e = new Example2_switchTo_mainpg_from_frame();
		e.m5();

	}

}
