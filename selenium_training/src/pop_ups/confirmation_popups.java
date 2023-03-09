package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation_popups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		try {
		driver.findElement(By.linkText("Agents Portal")).click();
		}catch(Exception e) {
			driver.findElement(By.linkText("Agents Portal")).click();
			
		}
		Alert confirmation = driver.switchTo().alert();
		System.out.println(confirmation.getText());
		confirmation.dismiss();
		try {
			driver.findElement(By.linkText("Agents Portal")).click();
			}catch(Exception e) {
				driver.findElement(By.linkText("Agents Portal")).click();

	}
		confirmation.accept();
      
}
}
