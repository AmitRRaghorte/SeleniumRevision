package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

// in this example we write code which willgenerate name of screenshot in runtime which means we dont need to give
// name manually everytime to screenhot
// in real time we will takes screen shot in this way that generate screenshot name on runtime
public class Example_2 {

	public void screenshott() throws IOException, InterruptedException

	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		int TCID=105;
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		
		File dest= new File("E:\\Velocity NOTES\\Automation\\Advance Selenium\\ScreenShotResult"+TCID+ ".jpg");
		
		
		FileHandler.copy(src, dest);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Example_2 e = new Example_2();
		e.screenshott();
	}

}
