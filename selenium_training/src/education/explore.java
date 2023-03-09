package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class explore {
	@Test(groups="functional")
	public void explorey() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://exploreysu.com/");
	  Reporter.log("exploreysu is opened",true);
	  driver.quit();
}
}
