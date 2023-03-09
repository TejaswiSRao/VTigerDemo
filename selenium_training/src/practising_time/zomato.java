package practising_time;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zomato {//explicitwait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitwait=new WebDriverWait(driver,15);
		driver.get("https://www.zomato.com/");
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(3000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Create account\"]")));
		driver.findElement(By.xpath("//label[text()='Full Name']")).sendKeys("Tejaswi");
		WebElement password = driver.findElement(By.xpath("//*[@label=\"Email\" and @type=\"text\" and @class=\"sc-1yzxt5f-6 bfympp\"]"));
		password.sendKeys("tejaswi123@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();

	}

}
