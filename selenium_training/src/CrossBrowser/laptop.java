package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class laptop {
	@Test
	public void buylaptop() {
		WebDriver driver = null;
		

		System.setProperty("WebDriver.chrome.driver",
				"\"C:\\\\\\\\Users\\\\\\\\LENOVO\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\ChromeDriver.exe");
		driver.get("https://www.apple.com/");

	}

}
