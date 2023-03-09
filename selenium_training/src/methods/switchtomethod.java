package methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtomethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);
		for(String window:allwindowid)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().contains("KFC")) {
				driver.close();
				break;
			}
		}
		



	}

}
