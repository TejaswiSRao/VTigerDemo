package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loactingelements_usingdirect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Tejaswi");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Tejaswi@123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();

	}

}
