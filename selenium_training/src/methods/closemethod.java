package methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class closemethod {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("file:///C:Users/user/Desktop/MultipleWindows.html");
      
	}

}
