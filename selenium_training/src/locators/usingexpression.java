package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingexpression {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		for(;;) {
			try {
			driver.findElement(By.id("loginclose1")).click();
			break;
			}catch(NoSuchElementException e) {
				Thread.sleep(2000);
			}
			
		}
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("img[title=\"Walken Bed With Storage (King Size, Honey Finish)")).click();

	}

}
