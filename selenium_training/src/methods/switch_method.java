package methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\LENOVO\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/11");
		Thread.sleep(6000);
		driver.findElement(By.id("fl_compare")).click();
		Thread.sleep(2000);
		
		Set<String> getwindowid = driver.getWindowHandles();
		
		for(String window:getwindowid) {
			driver.switchTo().window(window);
			String titleofpage = driver.getTitle();
			if(titleofpage.contains("amazon")) {
				driver.close();
				break;
			}
		}

	}

}
