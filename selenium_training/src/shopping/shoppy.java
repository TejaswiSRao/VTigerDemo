package shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class shoppy {
	@Test(groups="fruits")
	public void shoppyshopping() {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://web.skype.com/");
		  Reporter.log("skippe is opened",true);
		  driver.quit();
	}

}
