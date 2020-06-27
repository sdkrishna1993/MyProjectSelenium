package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelLoop {

	public static void main(String[] args) throws Exception {
File src = new File("/Users/krishnakumar/Downloads/ChromeDriverLatest/TestData.xlsx");
		
		///Users/krishnakumar/Downloads/ChromeDriverLatest/TestData
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);// total excel sheet will loaded
		//HSSF -xls
		XSSFSheet shee1=	wb.getSheetAt(0);
		
		int rowcount =shee1.getLastRowNum(); //20 start with 0 index
		
		System.out.println(rowcount);
		
		
		for (int i = 0; i < rowcount; i++) {
			
		String data0=	shee1.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println("Data from row"+i+" "+data0);
			
			
			
		}
	}
	
	

}
