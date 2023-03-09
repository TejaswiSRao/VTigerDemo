package usingenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_insta {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
//		WebElement instalogin = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		instalogin.click();
//		
//		System.out.println("----before entering data----");
//		System.out.println(instalogin.isDisplayed());
//		System.out.println(instalogin.isEnabled());
		driver.findElement(By.name("username")).sendKeys("Tejaswi");
		driver.findElement(By.name("password")).sendKeys("tejaswi@123");
		WebElement instalogin1 = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		instalogin1.click();
		System.out.println("----after entering data----");
		System.out.println(instalogin1.isDisplayed());
		System.out.println(instalogin1.isEnabled());
		
		
		

	}

}
