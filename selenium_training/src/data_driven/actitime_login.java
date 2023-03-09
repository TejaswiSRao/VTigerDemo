package data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime_login {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/testdata1.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String testurl = (String) prop.get("url");
		String user = (String) prop.get("username");
		String pass = (String) prop.get("password");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(testurl);
	
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.linkText("Login")).click();

	}

}
