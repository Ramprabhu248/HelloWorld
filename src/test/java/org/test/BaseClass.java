package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public WebDriver getDrive() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse\\New folder\\BaseClass\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}

	public void lunchUrl(WebDriver element,String url) {
		element.get(url);
	}

	public void sendKeys(WebElement element, String data) {
	element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
	element.click();
	}

	public void dropDown(WebElement elementRef, String data ) {
	Select s = new Select(elementRef);
	s.selectByValue(data);
	}
	
	public String getDataFromExcel(String pathname,String sheetname,int rowNo,int cellNo) throws IOException {
		File file = new File(pathname);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		String value ="";
		if (cellType==1) {
		 value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateformate = new SimpleDateFormat("DD-MMM-YY");
			value = dateformate.format(dateCellValue);			
		}else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(1);
		}
		return value;
		
		
		
	}

	
	
	
	

}
