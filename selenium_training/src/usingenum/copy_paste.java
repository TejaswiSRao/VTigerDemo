package usingenum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copy_paste {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 WebElement givingvalue = driver.findElement(By.id("email"));
				givingvalue.sendKeys("Tejaswi");
				givingvalue.sendKeys(Keys.CONTROL+"a");
				givingvalue.sendKeys(Keys.CONTROL+"c");
	     WebElement gettingvalue = driver.findElement(By.id("pass"));
	            gettingvalue.sendKeys(Keys.CONTROL+"v",Keys.ENTER);
	            
	}

}
