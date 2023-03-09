package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngpractisedependency {
	@Test(groups="integration")
	public void actitime(){
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.actitime.com/");
		  Reporter.log("actitime is opened",true);
		  driver.quit();
		
	}

}
