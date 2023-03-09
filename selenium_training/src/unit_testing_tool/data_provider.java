package unit_testing_tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//using 1D array
public class data_provider {
	@DataProvider
	public String[] senddata() {
		String[] arr= {"https://web.skype.com/","https://www.zomato.com/"};
		return arr;
		
	}
	
	@Test
	public void login(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get(url);
		  
		  driver.quit();
	}

}
