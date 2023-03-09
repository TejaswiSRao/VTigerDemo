package methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\LENOVO\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.swiggy.com/");
        String titleofthepage = driver.getTitle();
        System.out.println(titleofthepage);
	}

}
