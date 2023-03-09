package shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class swiggy {
	@Test(groups="food",dependsOnGroups="veges")
	public void foodie() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.swiggy.com/");
		  Reporter.log("swiggy is opened",true);
		  driver.quit();
	}

}
