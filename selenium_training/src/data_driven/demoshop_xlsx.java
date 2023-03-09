package data_driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoshop_xlsx {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create object of Fis/fr
				FileInputStream fis=new FileInputStream("./testdata/testdata.xlsx");
				
				//object of file type
				Workbook workbook = WorkbookFactory.create(fis);
				String gender = workbook.getSheet("Sheet3").getRow(1).getCell(0).toString().toLowerCase();
  			
  			String firstname = workbook.getSheet("Sheet3").getRow(1).getCell(1).toString();
  			String lastname = workbook.getSheet("Sheet3").getRow(1).getCell(2).toString();
  			String Email = workbook.getSheet("Sheet3").getRow(1).getCell(3).toString();
  			String password = workbook.getSheet("Sheet3").getRow(1).getCell(4).toString();
  			String confirm = workbook.getSheet("Sheet3").getRow(1).getCell(4).toString();
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//383,523
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-"+gender+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirm);
		driver.findElement(By.id("register-button")).click();

	}

}
