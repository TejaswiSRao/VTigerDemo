package assessement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopperstack_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fl_compare")).click();
		Map<String,String> titleandwindowid=new TreeMap<String,String>();
		
		Set<String> child = driver.getWindowHandles();
		
		for(String window:child) {
			driver.switchTo().window(window);
			titleandwindowid.put(driver.getTitle().toLowerCase().replace("www", ""),window);
       
		}
		Set<String> allkeys = titleandwindowid.keySet();
		for(String key:allkeys) {
			driver.switchTo().window(titleandwindowid.get(key));
			driver.close();
			Thread.sleep(1000);
		}
		
//		char charArray[] = str.toCharArray();
//	      Arrays.sort(charArray);
//	      System.out.println(new String(charArray));
//	      driver.close();
//		

	}

}
