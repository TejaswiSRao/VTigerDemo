package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_doddles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(;;) {
			try {
				driver.findElement(By.linkText("Celebrating Claudio Kano")).click();
				break;
			}
			catch(NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,500)");
			}
		}

	}

}
