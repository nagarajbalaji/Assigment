package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
public static WebDriver driver;
static File f;
static Workbook wb;
	
@BeforeClass
public static void browserLaunch() throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rooba\\Downloads\\Aug_Project2\\ExternalResources\\chromedriver.exe");
	driver= new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get(getUrl());
}
	
	//sendKeys
	public static void sendData(WebElement element , String data) {
		element.sendKeys(data);
	}
	//getText
	public static String getText(WebElement element)
	{
		String text = element.getText();
		return text;
		
	}
	
	// clickElement
	public static void clickdata(WebElement element ) {
		element.click();
	}
	
	//select option from the dropdown
	public static void selectData(WebElement element, String values) {
		Select s = new Select(element);
		s.selectByValue(values);
	}
	
	public static String getUrl() throws IOException {
		String value=null;
		 f = new File("E:\\Selenium\\Assigment\\ExternalResources\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(f);
			 wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("url");
				int numberOfRows = sheet.getPhysicalNumberOfRows();
				int numberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
				for(int i=0;i<numberOfRows;i++)
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
						
						
				}
					
					
	}
				return value;
	}

}
