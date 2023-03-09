package data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_libraries.excel_file;

public class demowebshopusingexcel {
	@DataProvider
	public String[][] data() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\\\Users\\\\LENOVO\\\\workspace\\\\test_yantra\\\\selenium_training\\\\testdata\\\\testdata.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("Sheet2");
	int row1 = sheet.getPhysicalNumberOfRows();
	
	int cell1 = sheet.getRow(0).getPhysicalNumberOfCells();
	
	
	String[][] value=new String[row1-1][cell1];
	
	//2-D array
	for(int i=0;i<row1-1;i++) {
		for(int j=0;j<cell1;j++) {
			value[i][j]=sheet.getRow(i+1).getCell(j).toString();
			System.out.println(value[i][j]);
			
		}
	
	
	}
	return value;
	
	

}
	
	
	
	@Test(dataProvider="data")
	public void passingdata(String[] credentials) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-"+credentials[0]+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(credentials[1]);
		driver.findElement(By.id("LastName")).sendKeys(credentials[2]);
		driver.findElement(By.id("Email")).sendKeys(credentials[3]);
		driver.findElement(By.id("Password")).sendKeys(credentials[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(credentials[5]);
		driver.findElement(By.id("register-button")).click();
	
		driver.quit();

		
	}

}
