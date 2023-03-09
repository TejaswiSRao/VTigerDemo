package pom_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
