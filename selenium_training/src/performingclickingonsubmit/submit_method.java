package performingclickingonsubmit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(1000);
		driver.findElement(By.linkText("X")).click();
		Thread.sleep(1000);
//		WebElement clicking = driver.findElement(By.xpath("//button[contains(text(),\"Submit\")] "));
//		clicking.submit();
		driver.findElement(By.xpath("//button[contains(text(),\"Submit\")] ")).submit();

	}

}
