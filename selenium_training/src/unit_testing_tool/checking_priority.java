package unit_testing_tool;

import org.testng.annotations.Test;

public class checking_priority {
	@Test(priority=-2)
	public void invalidlogin() {
		System.out.println("login is not posssible");
	}
	
	@Test(priority=10)
	public void login() {
		System.out.println("login is successful");
	}
	
	@Test
	public void details() {
		System.out.println("filling details");
	}
	
	@Test
	public void register() {
		System.out.println("successfully registered....!");
	}

}
