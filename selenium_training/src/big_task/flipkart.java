package big_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		for(;;) {
			try {
				WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
				click.sendKeys(Keys.ENTER);
				break;
			}
			catch(NoSuchElementException e) {
				Thread.sleep(3000);
			}
		}
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
        search.sendKeys("laptop",Keys.ENTER);
        driver.findElement(By.xpath("//div[text()='HP 15s Intel Core i5 12th Gen - (8 GB/512 GB SSD/Windows 11 Home) 15s-fq5111TU Thin and Light Laptop']")).click();
        WebElement cart = driver.findElement(By.xpath("//li[@class='col col-6-12']"));
        cart.sendKeys(Keys.ENTER);
	}

}
