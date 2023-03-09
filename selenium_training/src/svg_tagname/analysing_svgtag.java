package svg_tagname;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class analysing_svgtag {

	public static void main(String[] args) throws InterruptedException {
		// step1:launching the browser
		String state="california";
				System.setProperty("webdriver.chrome.driver",
						"C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
				WebDriver driver = new ChromeDriver();
				Reporter.log("browser launched successfully");
				driver.manage().window().maximize();
				Reporter.log("browser window is maximised");
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				WebDriverWait explicitwait = new WebDriverWait(driver, 15);
				driver.get("https://petdiseasealerts.org/forecast-map#/");
				driver.switchTo().frame(0);
				//driver.findElement(By.xpath("//*[name()=\"svg\" and @id=\"map-svg\"]//*[name()='g' and @id=\""+state+"\"]")).click();
//				Thread.sleep(3000);
//				driver.navigate().back();
//				driver.findElement(By.xpath("//*[name()=\"svg\" and @id=\"map-svg\"]//*[local-name()=\"g\" and @id=\"california\"]"));
				
				driver.findElement(By.xpath("//*[name()=\"svg\" and @id=\"map-svg\"]//*[name()='g' and @id=\"florida\"]")).click();
				driver.switchTo().defaultContent();
				//driver.switchTo().frame(0);
			}

	}


