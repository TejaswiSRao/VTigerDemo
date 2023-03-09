package unit_testing_tool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependencyonmethods {
	@Test
	public void createAccount() {
		int i=1/0;
		Reporter.log("account is created");
	}
	
	@Test(dependsOnMethods="createAccount")
	public void editAccount() {
	
		Reporter.log("account is edited");
	}
	
	@Test
	public void deletedAccount() {

		Reporter.log("account is deleted");
	}
	
	

}
