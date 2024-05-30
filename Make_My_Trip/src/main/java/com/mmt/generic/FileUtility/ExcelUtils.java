package com.mmt.generic.FileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public void getDataFromExcel(String sheetname, int rowno, int cellno) throws Throwable {

		FileInputStream fis = new FileInputStream("");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		String data = cell.getStringCellValue();

	}
	
	
	public void writeDataToExcel(String sheetname, int rowno, int cellno, Date data) throws Throwable {

		FileInputStream fis = new FileInputStream("");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.createCell(cellno);
		 cell.setCellValue(data);
		 
		 FileOutputStream fos = new FileOutputStream("");
		 book.write(fos);
		 book.close();

	}
}
