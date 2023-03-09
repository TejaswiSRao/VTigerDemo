package practising_time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=aFsNnGZ-yNw");
//		Thread.sleep(7000);
//		driver.findElement(By.name("search_query")).sendKeys("kranthi songs");
//		Thread.sleep(2000);
//		driver.findElement(By.id("search-icon-legacy")).click();
//		WebElement click = driver.findElement(By.xpath("//*[text()='Kranti | Bombe Bombe Kannada Song | Darshan, Rachitha Ram | V Harikrishna | Shylaja Nag, B Suresha']"));
//        click.click();
		
	}

}
