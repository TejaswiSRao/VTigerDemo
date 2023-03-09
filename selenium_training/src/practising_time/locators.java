package practising_time;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add restaurant")).click();
		
		
		
		


	}

}
