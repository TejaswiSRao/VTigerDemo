package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assessement {

	public static void main(String[] args) {
		//step 1:open the browser
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//step 2:Enter the URL
		driver.get("https://demowebshop.tricentis.com/");
		
		//step 3:click on search button without entering the data
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		//step 4:pop-up should be displayed and handled
		Alert alert = driver.switchTo().alert();
		
		//step 5:text of the pop-ups should be captured
		System.out.println(alert.getText());
		alert.accept();


	}

}
