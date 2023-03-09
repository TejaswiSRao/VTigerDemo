package pop_ups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calender_popups {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now().plusMonths(3);
		String month=ldt.getMonth().toString();
		int day=ldt.getDayOfMonth();
		month=""+month.charAt(0)+month.substring(1, month.length()).toLowerCase();
		int year=ldt.getYear();
		System.out.println(ldt);
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.trip.com/");
		driver.findElement(By.xpath("//input[@class='focus-input show-hightlight']")).click();
		for(;;) {
			try {
			   driver.findElement(By.xpath("//h3[text()='"+month+" "+year+"']/..//span[text()='"+day+"']")).click();
//			   driver.findElement(By.xpath("//h3[text()='"+month+" "+year+"']/..//span[text()='"+15+"']")).click();
				
			}
			
			
			catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@class='c-calendar-icon-next']")).click();
			}
		}

	}

}
