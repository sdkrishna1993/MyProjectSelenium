package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelLib {

	
	XSSFWorkbook wb ;
	XSSFSheet shee1;
	
	public ReadExcelLib(String excelpath) {
		
		try {
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			
			wb= new XSSFWorkbook(fis);// total excel sheet will loaded
			//HSSF -xls
			
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	
	public String getTestData(int sheetno,int row, int column) {
		
		shee1=	wb.getSheetAt(sheetno);
	String data=	shee1.getRow(row).getCell(column).getStringCellValue();
		
	return data;	
		
}
		
	
	

}

