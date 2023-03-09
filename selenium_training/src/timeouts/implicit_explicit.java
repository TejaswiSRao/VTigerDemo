package timeouts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit_explicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitwait=new WebDriverWait(driver,15);
		driver.get("https://www.shoppersstack.com/products_page/6");
		driver.findElement(By.xpath("//label[text()='Check Delivery']/../div/input")).sendKeys("560010");
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Check']")));
		driver.findElement(By.xpath("//button[text()='Check']")).click();

	}

}
