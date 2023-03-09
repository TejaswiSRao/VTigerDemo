package assessement;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class shoperrstack {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		
		
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fl_compare")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		TakesScreenshot ts=(TakesScreenshot)driver;
		for(String window:child) {
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);
	
		if(title.contains("ebay")) {
			
			File screenshot=ts.getScreenshotAs(OutputType.FILE);
			System.out.println(screenshot);
			FileHandler.copy(screenshot, new File("./errorpics/picture.png"));
			break;
		}
		

	}

	}
}
