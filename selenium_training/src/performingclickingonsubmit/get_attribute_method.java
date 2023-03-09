package performingclickingonsubmit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_attribute_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String tooldiptext = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).getAttribute("title");
         System.out.println(tooldiptext);
         
         //caturing color message
         WebElement capturingcolor = driver.findElement(By.id("loginButton"));
         System.out.println(capturingcolor.getCssValue("display"));
       System.out.println(capturingcolor.getCssValue("text-align"));
       		
         
         
	}

}
