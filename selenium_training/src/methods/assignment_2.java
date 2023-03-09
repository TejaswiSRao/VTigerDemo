package methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		String parentid = driver.getWindowHandle();
		Set<String> windowid = driver.getWindowHandles();
		windowid.remove(parentid);
		System.out.println(windowid.size());
		for(String window:windowid) {
			driver.switchTo().window(window);
			driver.close();
		}

	}

}
