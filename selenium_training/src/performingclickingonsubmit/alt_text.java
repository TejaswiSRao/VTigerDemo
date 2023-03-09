package performingclickingonsubmit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alt_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		String alttext = driver.findElement(By.xpath("//img[@alt=\"Dining\"]")).getAttribute("src");
		System.out.println(alttext);
		String tagname = driver.findElement(By.xpath("//img[@alt=\"Order Online\"]")).getTagName();
         System.out.println(tagname);
	}

}
