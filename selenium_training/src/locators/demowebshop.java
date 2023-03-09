package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Tejaswi");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Tejaswi@123");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("tejaswisrao1306@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("trying_@123");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("trying_@123");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys("tejaswisrao1306@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Password")).sendKeys("trying_@123");
//	    Thread.sleep(2000);
		
		

	}

}
