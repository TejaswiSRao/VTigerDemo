package practising_time;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demowebshop_assignment {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./testdata/testdata2.properties");
	    Properties prop=new Properties();
	   
	    prop.load(fis);
		String testurl = (String) prop.get("url");
		
		//step1:open the browser and enter the url
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser is launched successfully");
		driver.manage().window().maximize();
		System.out.println("browser window is maximised");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(testurl);
		
		//step2:verify user is able to click on login
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("cursor is clicked on login button");
		
        FileInputStream fis1=new FileInputStream("./testdata/testdata.xlsx");
	    Workbook workbook = WorkbookFactory.create(fis1);
	    
	    //step3:verifying that user is to enter the url 
	    String email = workbook.getSheet("Sheet1").getRow(0).getCell(1).toString();
		driver.findElement(By.id("Email")).sendKeys(email);
		System.out.println("email is entered successfully");
		
		//step4:verifying that user is able to enter the password successfully 
		String password = workbook.getSheet("Sheet1").getRow(1).getCell(1).toString();
		driver.findElement(By.id("Password")).sendKeys(password);
		System.out.println("password is entered successfully");
		
		//step5:verifying that user is able to click on login button successfully
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
		System.out.println("login is done succefully");
		
		//step6:verifying that user is able to click on electronics
		driver.findElement(By.partialLinkText("Electronics")).click();
		System.out.println("clicked on electronics successfully");
		
		//step7:verifying that user is able to click on cell phones
		driver.findElement(By.partialLinkText("Cell phones")).click();
		System.out.println("clicked on cellphones successfully");
		
		//step8:verifying that user us able to select the cell phone
		driver.findElement(By.xpath("//div//h2//a[text()='Smartphone']")).click();
		System.out.println("smartphone is selected");
		
		//step9:verifying that user able to click on add to cart
		driver.findElement(By.id("add-to-cart-button-43")).click();
		System.out.println("product is added to cart");
		
		//step10:verifying that user is able to click on shopping cart
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		System.out.println("shopping cart page is displayed");
		
		//step11:verifying that user able to click on check button successfully
		driver.findElement(By.id("termsofservice")).click();
		System.out.println("check button is clicked successfully");
		
		//step12:verifying that is able is able to click on checkout button successfully
		driver.findElement(By.id("checkout")).click();
		System.out.println("checkout button is clicked successfully");
		//driver.findElement(By.name("BillingNewAddress.CountryId")).sendKeys("India");
	
		String city = workbook.getSheet("Sheet1").getRow(2).getCell(1).toString();
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys(city);
		System.out.println("city details is entered");
		String address = workbook.getSheet("Sheet1").getRow(3).getCell(1).toString();
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys(address);
		
		String pincode = workbook.getSheet("Sheet1").getRow(4).getCell(1).toString();
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys(pincode);
		String phonenumber = workbook.getSheet("Sheet1").getRow(5).getCell(1).toString();
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//input[@title='Continue']")).click();
        Select select=new Select(driver.findElement(By.id("billing-address-select")));
        //select.selectByVisibleText(driver.findElement(By.id("billing-address-select")));
        driver.findElement(By.xpath("//input[@title=\"Continue\" and @type=\"button\"]")).click();
        driver.findElement(By.xpath("//input[@onclick=\"Shipping.save()\"]")).click();
        driver.findElement(By.xpath("//input[@onclick=\"ShippingMethod.save()\"]")).click();
        driver.findElement(By.xpath("//label[text()='Cash On Delivery (COD) (7.00)']")).click();
        driver.findElement(By.xpath("//input[@onclick=\"PaymentMethod.save()\"]")).click();
        driver.findElement(By.xpath("//input[@onclick=\"PaymentInfo.save()\"]")).click();
        driver.findElement(By.xpath("onclick=\"ConfirmOrder.save()\"")).click();
        
	
		
		
	
	
			
		    
		    
			
			
			
			
			
			
}
}
