package methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.caratlane.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
