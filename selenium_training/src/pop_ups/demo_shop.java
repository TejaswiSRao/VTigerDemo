package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class demo_shop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		
		for(;;) {
			try {
				WebElement click = driver.findElement(By.xpath("//a[text()='Swagger documentation']"));
				click.sendKeys(Keys.ENTER);
				break;
			}catch(Exception e) {
				Actions action=new Actions(driver);
				action.sendKeys(Keys.PAGE_DOWN).perform();
				
				}
		
		}
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		

	}

}


