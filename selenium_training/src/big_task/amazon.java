package big_task;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement entries = driver.findElement(By.id("twotabsearchtextbox"));
		entries.sendKeys("electronics",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='2,999']")).click();
		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);
		for(String window:allwindowid)
		{
			driver.switchTo().window(window);
		}
		WebElement cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		cart.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@id=\"attach-close_sideSheet-link\"]")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		WebElement value = driver.findElement(By.id("twotabsearchtextbox"));
		value.sendKeys("kurthi",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()=\"Chikankari Kurti\"]")).click();

	}

}
