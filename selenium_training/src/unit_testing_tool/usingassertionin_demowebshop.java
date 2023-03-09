package unit_testing_tool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class usingassertionin_demowebshop {
	@DataProvider
	public String[][] values(){
		String[][] arr= {{"male","classmate","jordan","classmate123@gmail.com","classmate123","classmate123"}};
		return arr;
		
		
	}
	@Test(dataProvider="values")
	public void passing(String[] credentials)
	{
		String hometitlepage = "";
		
		SoftAssert softassert=new SoftAssert();
		//step1:open the browser
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//383,523
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//step2:Enter the url 
		driver.get("https://demowebshop.tricentis.com/");
		softassert.assertEquals(driver.getTitle(), "webpage", "failed to navigate to web page");
		Reporter.log("webpage is opened");
		driver.quit();
		
		//step3:click on enter button
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		softassert.assertEquals(driver.getTitle(), "registerpage", "failed to navigate to home page");
		Reporter.log("navigate to register page is successfull",true);
		driver.quit();
		
		//step3:Fill the given details
		WebElement gender = driver.findElement(By.id("gender-"+credentials[0]+""));
		gender.click();
		softassert.assertEquals(gender.getAttribute("values"), credentials[0], "gender is not clicked");
		Reporter.log("gender is clicked",true);
		
		WebElement firstnametextfield = driver.findElement(By.id("FirstName"));
		firstnametextfield.clear();
		firstnametextfield.sendKeys(credentials[1]);
		softassert.assertEquals(firstnametextfield.getAttribute("values"), credentials[1], "firstname textfield is not entered");
		Reporter.log("firstname is entered in textfield successfully",true);
		
		WebElement lastnametextfield = driver.findElement(By.id("LastName"));
		lastnametextfield.clear();
		lastnametextfield.sendKeys(credentials[2]);
		softassert.assertEquals(lastnametextfield.getAttribute("values"), credentials[2], "lastname is not entered in textfield");
		Reporter.log("firstname is entered in textfield successfully",true);
		
		WebElement emailtextfield = driver.findElement(By.id("Email"));
		emailtextfield.clear();
		emailtextfield.sendKeys(credentials[3]);
		softassert.assertEquals(emailtextfield.getAttribute("values"), credentials[3], "email is not entered in textfield ");
		Reporter.log("email is successfully entered",true);
		
		WebElement passwordtextfield = driver.findElement(By.id("Password"));
		passwordtextfield.clear();
		passwordtextfield.sendKeys(credentials[4]);
		softassert.assertEquals(passwordtextfield.getAttribute("values"), credentials[4],"password is not specific");
		Reporter.log("password is entered successfully",true);
		
		WebElement confirmtextfield = driver.findElement(By.id("ConfirmPassword"));
		confirmtextfield.clear();
		confirmtextfield.sendKeys(credentials[5]);
		softassert.assertEquals(confirmtextfield.getAttribute("values"),credentials[5] , "confirm is not specified");
		Reporter.log("confirm password is entered",true);
		
		WebElement registerbutton = driver.findElement(By.id("register-button"));
		registerbutton.clear();
		registerbutton.sendKeys(credentials[6]);
		softassert.assertEquals(driver.getTitle(), "registerpage", "failed to navigate to register page");
		Reporter.log("navigate to register page is successfull",true);
		softassert.assertAll();
		driver.quit();
		
		
		
		
		
		
		
	}
}
