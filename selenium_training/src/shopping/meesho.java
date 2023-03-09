package shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class meesho {
	@Test(groups="clothing")
	public void meeshoshopping() {
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.meesho.com/");
		  Reporter.log("meesho is opened",true);
		  driver.quit();
		
	}

}
