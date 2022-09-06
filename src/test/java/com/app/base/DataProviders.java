package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviders extends BaseClass{
static File f;
static Workbook wb;

	
	@DataProvider(name ="usernameandpassword")
	public static Object[][] excelTestData() throws IOException {
		String value=null;
		 f = new File("E:\\Selenium\\Assigment\\ExternalResources\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(f);
			 wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("logins");
				int numberOfRows = sheet.getPhysicalNumberOfRows();
				int numberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
				Object [][] obj = new Object[numberOfRows-1][numberOfCells];
				for(int i=1;i<=numberOfRows-1;i++)
				{
					for(int j=0;j<numberOfCells;j++)
					{
						Row row = sheet.getRow(i);
						Cell cell = row.getCell(j);
						CellType cellType = cell.getCellType();
						if (cellType == CellType.STRING) {
							value = cell.getStringCellValue();
							
						} else if (cellType == CellType.NUMERIC) {
							if (DateUtil.isCellDateFormatted(cell)) {
								Date dateCellValue = cell.getDateCellValue();
								//System.out.println(dateCellValue);
								SimpleDateFormat sc = new SimpleDateFormat("dd/MM/yyyy");
								 value = sc.format(dateCellValue);
								System.out.println(value);
								
							} else {
								double numericCellValue = cell.getNumericCellValue();
								long a = (long) numericCellValue;
								 value = String.valueOf(a);
								//System.out.println(value);
								
							}

					}
						obj[i-1][j]=value;
						
				}
					
					
	}
				return obj;
	}
	
	@DataProvider(name ="incorrectusernameandpassword")
	public static Object[][] excelTestData1() throws IOException {
		 f = new File("E:\\Selenium\\Assigment\\ExternalResources\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(f);
			String value = null;
			 wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("incorrect logins");
				int numberOfRows = sheet.getPhysicalNumberOfRows();
				int numberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
				Object [][] obj = new Object[numberOfRows-1][numberOfCells];
				for(int i=1;i<=numberOfRows-1;i++)
				{
					for(int j=0;j<numberOfCells;j++)
					{
						Row row = sheet.getRow(i);
						Cell cell = row.getCell(j);
						CellType cellType = cell.getCellType();
						if (cellType == CellType.STRING) {
							value = cell.getStringCellValue();
						} else if (cellType == CellType.NUMERIC) {
							if (DateUtil.isCellDateFormatted(cell)) {
								Date dateCellValue = cell.getDateCellValue();
								//System.out.println(dateCellValue);
								SimpleDateFormat sc = new SimpleDateFormat("dd/MM/yyyy");
								value = sc.format(dateCellValue);
								System.out.println(value);
								
							} else {
								double numericCellValue = cell.getNumericCellValue();
								long a = (long) numericCellValue;
								value = String.valueOf(a);
								//System.out.println(value);
								
							}

					}
						obj[i-1][j]=value;
						
				}
					
					
	}
				return obj;
	}

}