package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readingmultipledatafromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File path=new File("C:\\Users\\LENOVO\\workspace\\test_yantra\\selenium_training\\testdata\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet4 = workbook.getSheet("Sheet4");
		int row = sheet4.getPhysicalNumberOfRows();
		//System.out.println(row);
		int cell = sheet4.getRow(0).getPhysicalNumberOfCells();
		//System.out.println(cell);
		
		String[][] value=new String[row][cell];
		
		//2-D array
		for(int i=1;i<row;i++) {
			for(int j=0;j<cell;j++) {
				value[i][j]=sheet4.getRow(i).getCell(j).toString();
				System.out.println(value[i][j]);
				
			}
			System.out.println("********************");
		}

	}

}
