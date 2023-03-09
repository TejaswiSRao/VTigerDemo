package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\tejaswisrao....resume.pdf");

	}

}
