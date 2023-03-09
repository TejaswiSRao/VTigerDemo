package generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_file {
	
	
	String Sheetname="Sheet3";
	String path="C:\\Users\\LENOVO\\workspace\\test_yantra\\selenium_training\\testdata\\testdata.xlsx";
	
	
	public void readingnumber(String sheet,int row,int cell){
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("path");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double testdata = workbook.getSheet(Sheetname).getRow(row).getCell(cell).getNumericCellValue();
		System.out.println(testdata);
	}
	
	public void booleanvalues(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("path");
		Workbook workbook = WorkbookFactory.create(fis);
		boolean testdata = workbook.getSheet(Sheetname).getRow(row).getCell(cell).getBooleanCellValue();
		System.out.println(testdata);
	}
	
	public void stringtypedata(String Sheet,int row,int cell){
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("path");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdata = workbook.getSheet(Sheetname).getRow(row).getCell(cell).toString();
		System.out.println(testdata);
	}
	
	public void dateandtime(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("path");
		Workbook workbook = WorkbookFactory.create(fis);
		LocalDateTime testdata = workbook.getSheet(Sheetname).getRow(row).getCell(cell).getLocalDateTimeCellValue();
		System.out.println(testdata);
	}
	
	public String[][] array(int row,int cell)throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("path");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(Sheetname);
		int row1 = sheet.getPhysicalNumberOfRows();
		
		int cell1 = sheet.getRow(row).getPhysicalNumberOfCells();
		
		
		String[][] value=new String[row1-1][cell1];
		
		//2-D array
		for(int i=0;i<row1-1;i++) {
			for(int j=0;j<cell1;j++) {
				value[i][j]=sheet.getRow(i+1).getCell(j).toString();
				System.out.println(value[i][j]);
				
			}
		}
		return value;
		
	}
	

}
