package ExcelData;

public class ReadMain {

	public static void main(String[] args) {
	
		ReadExcelLib obj = new ReadExcelLib("/Users/krishnakumar/Downloads/ChromeDriverLatest/TestData.xlsx");

		String value = obj.getTestData(0, 1, 1);
		System.out.println(value);
		
		

	}

}
