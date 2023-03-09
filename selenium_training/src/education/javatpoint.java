package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class javatpoint {
	@Test(groups="smoke",dependsOnGroups="functional")
	public void java() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.javatpoint.com/");
		  Reporter.log("javatpoint is opened",true);
		  driver.quit();
	}

}
