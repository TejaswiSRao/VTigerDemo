package drop_downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select dayselect=new Select(daydropdown);
		Select monthselect=new Select(monthdropdown);
		Select yearselect=new Select(yeardropdown);
		dayselect.selectByIndex(0);
		monthselect.selectByValue("10");
		yearselect.selectByVisibleText("1992");
		List<WebElement> allmonthoption = monthselect.getOptions();
		for(WebElement month:allmonthoption) {
			System.out.println(month.getText());
			monthselect.selectByVisibleText(month.getText());
			Thread.sleep(1000);
		}

	}

}
