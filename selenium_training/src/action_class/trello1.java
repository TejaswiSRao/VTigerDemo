package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class trello1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//WebDriverWait explicitwait=new WebDriverWait(driver,15);
		Actions action=new Actions(driver);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//h5[text()='High Tatras']")).click();
//		WebElement sourceElement = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
//		WebElement targetElement = driver.findElement(By.xpath("//span[text()='Trash']"));
//		
//		
//		action.dragAndDrop(sourceElement, targetElement).perform();
//		

	}

}
