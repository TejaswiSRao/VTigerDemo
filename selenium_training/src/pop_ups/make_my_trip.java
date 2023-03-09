package pop_ups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class make_my_trip {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime ldt=LocalDateTime.now().plusMonths(3);
		String month=ldt.getMonth().toString();
		int day=ldt.getDayOfMonth();
		month=""+month.charAt(0)+month.substring(1, month.length()).toLowerCase();
		int year=ldt.getYear();
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.agoda.com/");
		for(;;) {
			try {
				driver.findElement(By.xpath("//button[@aria-label=\"Close Message\"]")).click();
			break;
			}catch(NoSuchElementException e) {
				Thread.sleep(2000);
			}
			
		}
		driver.findElement(By.id("check-in-box")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='February 2023']/..//span[text()='14']")).click();
				
			}catch(NoSuchElementException e) {
				
			}
			
		}
		
	}

}
