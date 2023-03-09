package big_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String subject = "Tejaswi";
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.xpath("//li[@title='Compose a new mail']")).click();
		// driver.switchTo().frame(3);
		driver.findElement(By.xpath("//input[@placeholder='Enter name or email' and  @id = 'TO_IDcmp2']"))
				.sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys(subject);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]")));
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Good Afternoon");
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")).click();
		driver.findElement(By.linkText("Send")).click();
		for (;;) {
			try {
				driver.findElement(By.xpath("//span[text()='" + subject + "']/..//cite[@title=\"Select mail\"]"))
						.click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//cite[@title='Refresh Inbox']")).click();
			}
		}
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		System.out.println(driver.findElement(By.id("rdNotify")).getText());

	}

}
