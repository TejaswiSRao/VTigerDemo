package usingenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		 WebElement clicking = driver.findElement(By.id("gender-female"));
		 clicking.click();
		 System.out.println(clicking.isDisplayed());
		 System.out.println(clicking.isEnabled());
		 System.out.println(clicking.isSelected());

	}

}
