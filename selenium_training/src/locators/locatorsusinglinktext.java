package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsusinglinktext {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    String parentwindowid = driver.getWindowHandle();
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Set<String> windowsid = driver.getWindowHandles();
		windowsid.remove(parentwindowid);
		for(String window:windowsid) {
			driver.switchTo().window(window);
		}
		Thread.sleep(6000);
		driver.findElement(By.linkText("Try Free")).click();
	}

}
