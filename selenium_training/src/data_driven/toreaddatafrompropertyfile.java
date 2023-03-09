package data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class toreaddatafrompropertyfile {

	public static void main(String[] args) throws IOException {
		
		//step1:creation of input stream
		FileInputStream fis=new FileInputStream("./testdata/testdata.properties");
		
		//step2:creation of file type object
		Properties prop=new Properties();
		
		//step3:read methods
		prop.load(fis);
		String testurl = (String) prop.get("url");
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(testurl);
		
		

	}

}
