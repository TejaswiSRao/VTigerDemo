package findelements_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kalki_fashions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		List<WebElement> elements = driver.findElements(By.partialLinkText("SALWAR KAMEEZ"));
		
          System.out.println(elements.get(0).getText());
          
         List<WebElement> elements1 = driver.findElements(By.xpath("//div[@x-ref=\"nav-desktop\"]"));
         System.out.println(elements1.get(0).getText());
         
         List<WebElement> searchelements = driver.findElements(By.xpath("//input[@id='search-input']"));
         
         System.out.println(searchelements.size());
	     List<WebElement> listing = driver.findElements(By.id("search-input"));
	     System.out.println(listing.get(0).getText());
	}

}
