package configuration_annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orderofexecution {
	@BeforeSuite
	public void open() {
		Reporter.log("door is opened");
	}
	
	@BeforeTest
	public void grabchair() {
		Reporter.log("get the chair");
	}
	
	@BeforeClass
	public void takeurseat() {
		Reporter.log("settle");
	}
	
	@BeforeMethod
	public void learn() {
		Reporter.log("study");
	}
	@Test
	public void create_account() {
		Reporter.log("account should be created");
	}
	@AfterSuite
	public void open1() {
		Reporter.log("door is opened");
	}
	
	@AfterTest
	public void grabchair1() {
		Reporter.log("get the chair");
	}
	
	@AfterClass
	public void takeurseat1() {
		Reporter.log("settle");
	}
	
	@AfterMethod
	public void learn1() {
		Reporter.log("study");
	}
	
	

}
