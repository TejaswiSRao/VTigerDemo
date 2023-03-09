package methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class togetpagesource {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.meesho.com/");
	String gettingpage = driver.getPageSource();
	System.out.println(gettingpage);
	}

}
