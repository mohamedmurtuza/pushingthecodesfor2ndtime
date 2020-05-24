package dataDriven;

public class ExcelReading {

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\91782\\eclipse-workspace\\InterviewPreparation\\Utilities\\A.xlsx");

		String sheetName = "Credentials";
		String colName = "Testcases";

		String data = reader.getCellData(sheetName, 1, 2);
		System.out.println(data);
	}

}
