package methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class managingwindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		
		Dimension beforemaxi = driver.manage().window().getSize();
		System.out.println(beforemaxi.getHeight());
		System.out.println(beforemaxi.getWidth());
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Dimension aftermaxi = driver.manage().window().getSize();
	    System.out.println(aftermaxi.getHeight());
	    System.out.println(aftermaxi.getWidth());
	}

}
