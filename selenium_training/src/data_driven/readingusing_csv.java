package data_driven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class readingusing_csv {

	public static void main(String[] args) throws IOException, CsvException {
		
		//Creating of FIS/FR
		FileReader f=new FileReader("./testdata/testdata.csv");
		 
		//creating a file type object
		CSVReader reader=new CSVReader(f);
		
		//read methods
//		String[] firstlinedata = reader.readNext();
//		for(String data:firstlinedata) {
//			System.out.println(data+" ,");
//		}
//		
//		String[] secondlinedata = reader.readNext();
//		for(String data:secondlinedata) {
//			System.out.println(data+" ,");
//		}
		
		List<String[]> alldata = reader.readAll();
		for(String[] sarr:alldata) {
			for(String arr:sarr) {
				System.out.println(arr+" ");
			}
			System.out.println();
		}

	}

}
