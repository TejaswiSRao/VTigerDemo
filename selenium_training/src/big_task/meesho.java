package big_task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		WebElement searching = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
	    searching.sendKeys("kurthi",Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//img[@alt='Aakarsha Ensemble Kurtis']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='M']")).click();
//	    WebElement addingcart = driver.findElement(By.xpath("//button[@class=\"sc-ezOQGI ifupSK ProductCard__GhostButtonBigStyled-sc-camkhj-2 Uqksj ProductCard__GhostButtonBigStyled-sc-camkhj-2 Uqksj\"]"));
//	    addingcart.sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//div[@class=\"sc-iveFHk sc-lllmON wNxAQ feJma-D\"]")).click();
	    WebElement searching1 = driver.findElement(By.xpath("//input[@placeholder=\"Try Saree, Kurti or Search by Product Code\"]"));
	    searching1.sendKeys("electronics",Keys.ENTER);
	    driver.findElement(By.xpath("//img[@src=\"https://images.meesho.com/images/products/158778649/nx5tf_400.jpg\"]")).click();
	
	}

}
