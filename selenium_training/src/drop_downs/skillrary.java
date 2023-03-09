package drop_downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class skillrary {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement multilistbox = driver.findElement(By.id("cars"));
		Select multilist=new Select(multilistbox);
		System.out.println(multilist.isMultiple());
		multilist.selectByValue("299");
		multilist.selectByIndex(0);
		System.out.println(multilist.getFirstSelectedOption());
		List<WebElement> selectedoption = multilist.getAllSelectedOptions();
		for(WebElement list:selectedoption) {
			System.out.println(list.getText());
		}
		multilist.deselectByIndex(3);
		}
		}
		
	


