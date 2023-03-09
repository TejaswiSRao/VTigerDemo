package data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class adoadatask {

	public static void main(String[] args) throws IOException, InterruptedException {
FileInputStream fis=new FileInputStream("./testdata/adoda.properties");
FileInputStream f=new FileInputStream("./testdata/testdata.xlsx");
		
		
		Properties prop=new Properties();
		
		
		prop.load(fis);
		String testurl = (String) prop.get("url");
		
		LocalDateTime ldt=LocalDateTime.now();
		String month=ldt.getMonth().toString();
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//383,523
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//WebDriverWait explicitwait=new WebDriverWait(driver,15);
		driver.get(testurl);
		
		//explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Close Message']")));
	
		for(;;) {
			try {
				driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
			break;
			}catch(NoSuchElementException e) {
				Thread.sleep(2000);
			}
			
		}
		driver.findElement(By.xpath("//h6[text()='Flights']")).click();
		
		
		//entering text to from field
		Workbook workbook = WorkbookFactory.create(f);
		
//		Date ltd = workbook.getSheet("Sheet2").getRow(4).getCell(1).getDateCellValue();
//		int day=ldt.getDayOfMonth();
//		month=""+month.charAt(0)+month.substring(1, month.length()).toLowerCase();
//		int year=ldt.getYear();
		String fromtextfield = workbook.getSheet("Sheet3").getRow(3).getCell(0).toString();
		String totextfield = workbook.getSheet("Sheet3").getRow(5).getCell(0).toString();
		driver.findElement(By.xpath("//input[@aria-label=\"Flying from\"]")).sendKeys(fromtextfield);
		driver.findElement(By.xpath("//input[@aria-label=\"Flying to\"]")).sendKeys(totextfield);
		
		driver.findElement(By.id("flight-departure")).click();
//		driver.findElement(By.xpath("//div[text()='Departure']")).click();
//		Actions action=new Actions(driver);
//		action.moveByOffset(383, 523).doubleClick().perform();
//		for(;;) {
//			try {
//			   driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/..//span[text()='"+day+"']")).click();
//			   }catch(NoSuchElementException e) {
//				driver.findElement(By.xpath("//span[@arial-label='Next Month']")).click();
//			}
//		
//		
//		}

	}
}

 
