package methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class toknowmanagemethod {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
   ChromeDriver driver=new ChromeDriver();
   
   driver.get("https://www.meesho.com/");
   
   Point settingpos = driver.manage().window().getPosition();
   System.out.println(settingpos.getX());
   System.out.println(settingpos.getY());
   
   driver.manage().window().setSize(new Dimension(100,300));
   Thread.sleep(2000);
   
   driver.manage().window().setPosition(new Point(2,5));
   
	}

}
