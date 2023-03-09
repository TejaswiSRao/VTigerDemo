package selenium_training;

import org.openqa.selenium.firefox.FirefoxDriver;


public class launchingfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

	}

}
