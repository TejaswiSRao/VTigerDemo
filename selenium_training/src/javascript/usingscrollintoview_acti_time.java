package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingscrollintoview_acti_time {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//step-1:if u have every id ,name....etc
		
		WebElement mobile = driver.findElement(By.id("mobile"));
		js.executeScript("arguments[0].scrollIntoView(true);",mobile);
		
		//step-2 :if u have to use x-path
//		WebElement info = driver.findElement(By.xpath("//span[text()='Send me important updates on']"));
//		js.executeScript("arguments[0].scrollIntoView(false)", info);
		

	

	}

	
	}


