package action_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class trello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitwait=new WebDriverWait(driver,15);
		driver.get("https://trello.com/");
//		WebElement signup = driver.findElement(By.name("email"));
//		signup.sendKeys("tejaswisrao1306@gmail.com",Keys.ENTER);
//		driver.findElement(By.id("signup-submit")).click();
//		driver.findElement(By.id("login-submit")).click();
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("Tejaswi@123",Keys.ENTER);
//		driver.findElement(By.linkText("Train the Trainners")).click();
//		Actions action=new Actions(driver);
//		Thread.sleep(3000);
//		action.moveByOffset(380, 146).contextClick().perform();
//		List<WebElement> capturing = driver.findElements(By.xpath("//div[@class='quick-card-editor-buttons fade-in']"));
//		System.out.println(capturing.get(0).getText());
		
		driver.findElement(By.linkText("Log in")).click();
		WebElement user = driver.findElement(By.id("user"));
		user.sendKeys("tejaswisrao1306@gmail.com",Keys.ENTER);
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Tejaswi@123",Keys.ENTER);
		driver.findElement(By.linkText("Train the Trainners")).click();
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveByOffset(380, 146).contextClick().perform();
		List<WebElement> capturing = driver.findElements(By.xpath("//div[@class='quick-card-editor-buttons fade-in']"));
		System.out.println(capturing.get(0).getText());
		System.out.println(capturing.size());
		
	}
	

}
