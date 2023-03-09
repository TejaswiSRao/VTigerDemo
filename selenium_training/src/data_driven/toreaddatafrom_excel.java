package data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import generic_libraries.excel_file;

public class toreaddatafrom_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//create object of Fis/fr
		FileInputStream fis=new FileInputStream("./testdata/testdata.xlsx");
		
		//object of file type
		Workbook workbook = WorkbookFactory.create(fis);
		
		//read methods
//		String testdata1 = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
//		System.out.println(testdata1);

		//reading numeric values
//		double testdata = workbook.getSheet("Sheet1").getRow(3).getCell(6).getNumericCellValue();
//		System.out.println(testdata);
		
		//reading boolean values
//		boolean testdata = workbook.getSheet("Sheet1").getRow(8).getCell(3).getBooleanCellValue();
//		System.out.println(testdata);
		
		//reading time value
		Date testdata = workbook.getSheet("Sheet1").getRow(0).getCell(0).getDateCellValue();
		System.out.println(testdata);
		
		
		
		
	}

}
