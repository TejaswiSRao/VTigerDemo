package configuration_annotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class unit_calss {
	WebDriver driver;
	
	
	
	@BeforeClass
   public void browsersetup() {
		//step1:launching the browser
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		 driver=new ChromeDriver();
		  Reporter.log("browser launched successfully");
		  driver.manage().window().maximize();
		  Reporter.log("browser window is maximised");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  WebDriverWait explicitwait=new WebDriverWait(driver,15);
	}
	      @BeforeMethod
	      public void logintoapp() throws EncryptedDocumentException, IOException {
	    	//step2:open the app using url  
		  driver.get("https://www.shoppersstack.com/");
		 
		  FileInputStream fis=new FileInputStream("./testdata/testdata.xlsx");
		  Workbook workbook = WorkbookFactory.create(fis);
		  String email = workbook.getSheet("Sheet5").getRow(1).getCell(1).toString();
		  //driver.findElement(By.id("email")).sendKeys(email);
		  driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		  
		  
	}

}
