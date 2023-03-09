package performingclickingonsubmit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demodhop_task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("JEWELRY")).click();
		driver.findElement(By.xpath("//img[@title=\"Show details for Black & White Diamond Heart\"]")).click();
		String errormsg = driver.findElement(By.xpath("//div[@class=\"short-description\"]")).getText();
		System.out.println(errormsg);
		String errormsg1 = driver.findElement(By.xpath("//div[@class=\"full-description\"]")).getText();
		System.out.println(errormsg1);
	}
}
