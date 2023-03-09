package data_driven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.chrome.ChromeDriver;

public class bmwusing_json {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader f=new FileReader("./testdata/testdata.json");
		
		JSONParser parser=new JSONParser();
		JSONObject json=(JSONObject)parser.parse(f);
		
		String testurl = (String)json.get("url");
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(testurl);
		System.out.println(json.get("username"));
		System.out.println(json.get("price"));
		
		

	}

}
