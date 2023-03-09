package generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property_file {
  public void propertyfile() throws IOException {
	  FileInputStream fis=new FileInputStream("");
	  Properties prop=new Properties();
	  prop.load(fis);
		String testurl = (String) prop.get("url");
		
		
	  
  }
}
