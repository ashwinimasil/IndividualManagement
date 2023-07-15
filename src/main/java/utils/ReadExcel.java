package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	public static String[][] readExcel(String fileName) throws IOException {
	XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
	XSSFSheet sheet = wb.getSheetAt(0);
	int rowCount = sheet.getLastRowNum();
	int colCount = sheet.getRow(0).getLastCellNum();
	System.out.println("Row count" +rowCount);
	System.out.println("Column count" +colCount);
	String[][] data = new String[rowCount][colCount];
	for (int i = 1; i <= rowCount; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < colCount; j++) {
			XSSFCell cell = row.getCell(j);
			String stringCellValue = cell.getStringCellValue();
			data[i-1][j]=(stringCellValue);
		}
	}	
	wb.close();
	return data;
}
	}
	
