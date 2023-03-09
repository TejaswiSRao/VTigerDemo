package usingenum;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class compatability_testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Rectangle emailrectobject = email.getRect();
		Rectangle passwordrectobject = password.getRect();
		
		if(emailrectobject.getX()==passwordrectobject.getX()) {
			System.out.println("both alignment is same");
		}else {
			System.out.println("aligment are different");
		}
		if(emailrectobject.getX()+emailrectobject.getWidth()==passwordrectobject.getX()+passwordrectobject.getWidth()) {
			System.out.println("width are equal");
		}
		else {
			System.out.println("width are not equal");
		}
		if(emailrectobject.getY()+emailrectobject.getHeight()+3<=passwordrectobject.getY()) {
			System.out.println("height is equal");
			
		}
		else {
			System.out.println("height are not equal");
		}
		
		

	}

}
