package big_task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dunzo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/search");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for item or a store\"]")).sendKeys("oranges");
		driver.findElement(By.xpath("//img[@src=\"https://ik.imagekit.io/dunzo/tr:w-$w$,h-$h$,cm-pad_resize/02094e545c1011ed94ebbdedde8f74fa_PRODUCT_5c790174d661476ccea6355b_1.jpg\"]/../..//button[@shape=\"circular\"]")).click();
	}

}
