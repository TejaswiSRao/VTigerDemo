package unit_testing_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderusing_2D {
	@DataProvider
	public String[][] senddata(){
		String[][] arr={{"admin","manager"},{"trainee","trainee"},{"tejaswi","tejaswi@123"}};
		return arr;
	}
	
	@Test(dataProvider="senddata")
	public void login(String [] credentials) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.actitime.com/login.do");
		  Thread.sleep(2000);
		 
		driver.findElement(By.id("username")).sendKeys(credentials[0]);
		driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
		driver.findElement(By.linkText("Login")).click();
		  
		  driver.quit();
		
	}

}
