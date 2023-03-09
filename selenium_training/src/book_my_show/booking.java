package book_my_show;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class booking {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\LENOVO\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("driver is maximized");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicit = new WebDriverWait(driver, 15);
		driver.get("https://in.bookmyshow.com/");
		// fetching data from excel
		File path = new File("C:\\Users\\LENOVO\\workspace\\test_yantra\\selenium_training\\testdata\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fis);
		String place = workbook.getSheet("Sheet6").getRow(0).getCell(1).toString();
		 WebElement select = driver.findElement(By.xpath("//input[@placeholder='Search for your city']"));
		 select.sendKeys(place,Keys.ENTER);

	}

}
