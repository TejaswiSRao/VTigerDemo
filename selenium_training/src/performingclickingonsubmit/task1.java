package performingclickingonsubmit;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		int navBarIndex=6;
		int categoryIndex=3;
		int productIndex=4;
		
		for(;;) {
			try {
			driver.findElement(By.id("loginclose1")).click();
			break;
			}catch(NoSuchElementException e) {
				Thread.sleep(2000);
			}
			
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//nav[@class=\"menu\"]/ul/li[5]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"top-list\"]/a[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='load-product-item flex cattwo category-three']/div[5]/div[3]/a")).click();
        Thread.sleep(1000);
        String parentwindowId=driver.getWindowHandle();
        Set<String> allwindowhandles = driver.getWindowHandles();
        allwindowhandles.remove(parentwindowId);
        for(String window:allwindowhandles) {
        	driver.switchTo().window(window);
        }
        Thread.sleep(1000);
       String price_details = driver.findElement(By.xpath("//span[@class='offerprice' and not(@class='offprice')]")).getText();
       String[] prices=price_details.split("R");
       String priceoftheproduct=prices[1].replace("s", "").replace(",","").replace(" ","");
       int price=Integer.parseInt(priceoftheproduct);
       driver.findElement(By.xpath("//button[@type=\"button\" and @aria-label=\"Minimize widget\"]")).click();
       if(price<5000) {
    	   driver.findElement(By.id("button-cart-buy-now")).click();
       }
       else {
    	   System.out.println("The product cost is too high.....");
       }
       String product_details = driver.findElement(By.xpath("//div[@class=\"overview\"]")).getText();
       System.out.println(product_details);
      
       
       
       
	}

}
