package unit_testing_tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class opening_browser_using_testNG {
      @Test(priority=2)
      public void myntra() {
      System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.myntra.com/");
	  driver.quit();
      }
      
      @Test(priority=3)
      public void amazon() {
    	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
    	  WebDriver driver=new ChromeDriver();
    	  driver.get("https://www.amazon.in/");
    	  driver.quit();
      }
      
      @Test(priority=1,invocationCount=2,threadPoolSize=3)
      public void makemytrip() {
      System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.makemytrip.com/");
	  driver.quit();
      }
      
      @Test(invocationCount=3)
      public void youtube() {
    	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
    	  WebDriver driver=new ChromeDriver();
    	  driver.get("https://www.youtube.com/");
    	  driver.quit();
    	  
      }
	

	}


