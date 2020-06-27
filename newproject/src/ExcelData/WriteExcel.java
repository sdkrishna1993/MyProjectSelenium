package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/krishnakumar/Downloads/ChromeDriverLatest/TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("fail");
		sheet1.getRow(2).createCell(2).setCellValue(14.12);
		FileOutputStream fout =new FileOutputStream(file);
		
		wb.write(fout);
		
		wb.close();
		
		
		
		
	}
	

}
