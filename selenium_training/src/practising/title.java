package practising;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String handler = driver.getWindowHandle();
		System.out.println(handler);
		driver.manage().window().maximize();
		Point findingpos = driver.manage().window().getPosition();
		System.out.println("findingpos"+findingpos.getX());
		System.out.println("findingpos"+findingpos.getY());
		Dimension findingsize = driver.manage().window().getSize();
		System.out.println(findingsize);
		driver.manage().window().setSize(new Dimension(100,200));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(29,83));
		

	}

}
