package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_tagname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.cssSelector("img[alt=\"BANG\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt=\"Kranti\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("page-cta-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("wzrk-confirm")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()=\"Filter Show Timings\"]")).click();

	}

}
