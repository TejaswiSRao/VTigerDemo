package methods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowscapturing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.swiggy.com/");
Set<String> capturingid = driver.getWindowHandles();

for(String window:capturingid) {
	System.out.println(window);
	
}
	}

}
