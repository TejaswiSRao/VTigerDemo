package convertingmanual_atomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author TEJASWI
 *
 */
public class acti_time {

	public static void main(String[] args) throws InterruptedException {
		//Expected Data
		String usernameData="admin";
		String passwordData="manager";
		String expectedLoginpageTitle="actiTIME - Login";
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		
		//step 1: Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("browser is launched");
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		//step 2:enter the Test URL and click 'Enter' button
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPage=driver.getTitle();
		if(expectedLoginpageTitle.equals(actualLoginPage)) {
			System.out.println("Login page is displayed");
		} else {
			System.out.println("Login page is not dispalyed");
		}
		
		//step 3:click on the 'Username' text field and provide the input
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(usernameData);
		String actualDataEnteredInUsernameTextField=usernameTextField.getAttribute("value");
		if(actualDataEnteredInUsernameTextField.equals(usernameData)) {
			System.out.println("username text field accepted the test data");
		} else {
			System.out.println("username textfield failed to accept the test data");
		}
		
		//step 4:click on the 'Password' text field and provide the input
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(passwordData);
		String actualDataEnteredInPasswordTextField=passwordTextField.getAttribute("value");
		if(actualDataEnteredInPasswordTextField.equals(passwordData)) {
			System.out.println("password textfield accepted the test data");
		} else {
			System.out.println("password textfield failed to accept the test data");
		}
		
		//step 5:Click on 'Login' button 
		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(3000);
		String actualHomePageTitle=driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("home page is displayed successfully");
		} else {
			System.out.println("home page is not displayed");
		}
		

	}

}
