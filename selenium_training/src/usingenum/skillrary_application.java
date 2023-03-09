package usingenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillrary_application {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement option = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));
		System.out.println(option.isSelected());
	     option.click();
		System.out.println(option.isSelected());
		

	}

}
