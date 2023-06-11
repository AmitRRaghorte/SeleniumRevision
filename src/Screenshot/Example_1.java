package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;       // take screenshot
import org.openqa.selenium.WebDriver;             // created desired path to store screenshot
import org.openqa.selenium.chrome.ChromeDriver;   // send screenshot from local folder to desired folder using FileHandler
import org.openqa.selenium.io.FileHandler;
 
// take screen shot
// defiend path desired path and store it into img type like file 
// concatinate path so that it will generate runtime name for scrrenn shot
// cut & paste screenshot on desired location using FileHandler
public class Example_1 {

	public void m5() throws IOException 
	{
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		
		File src = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		// create obj of file and store desired path folder 
		File dest = new File ("E:\\Velocity NOTES\\Automation\\Advance Selenium\\ScreenShotResult\\fb.jpg");
		
		FileHandler.copy(src, dest); // this method sent img from local folder to our desired folder i.e cut paste img
	    
		 Driver.close();
	}

	public static void main(String[] args) throws IOException 
	{
		Example_1 e = new Example_1();
		e.m5();
	}

}
