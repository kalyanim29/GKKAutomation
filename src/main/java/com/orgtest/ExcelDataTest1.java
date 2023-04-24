package com.orgtest;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataTest1 {

	
	@Test
	public void excel() throws IOException
	{
		@SuppressWarnings("resource")
		XSSFWorkbook book=new XSSFWorkbook(".//Data//TestData.xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();   
		int colCount=sheet.getRow(1).getLastCellNum();

		for(int i=0;i<=rowCount;i++)
		{
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<colCount;j++)
		{
			try {
		String cellValue=row.getCell(j).getStringCellValue();
		System.out.println(cellValue);
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		}
	}
}