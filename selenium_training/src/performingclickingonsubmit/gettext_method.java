package performingclickingonsubmit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("register-button")).submit();
		Thread.sleep(1000);
		String errormsg = driver.findElement(By.xpath("//span[text()=\"First name is required.\"]")).getText();
		System.out.println(errormsg);
		String errormsg1 = driver.findElement(By.xpath("//span[@for='LastName']")).getText();
		System.out.println(errormsg1);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).submit();
		String errormsg2 = driver.findElement(By.xpath("//div[@class=\"validation-summary-errors\"]")).getText();
		System.out.println(errormsg2);
		
	}

}
