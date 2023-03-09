package practising;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigating {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.caratlane.com/");
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate();
		driver.get("https://www.meesho.com/");
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);

	}

}
