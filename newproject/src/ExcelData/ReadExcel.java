package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("/Users/krishnakumar/Downloads/ChromeDriverLatest/TestData.xlsx");
		
		///Users/krishnakumar/Downloads/ChromeDriverLatest/TestData
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);// total excel sheet will loaded
		//HSSF -xls
		XSSFSheet shee1=	wb.getSheetAt(0);
		
		String data0=	shee1.getRow(0).getCell(1).getStringCellValue();
	
		System.out.println(data0);
		
		wb.close();
		
		
		
		
		
	}

}
