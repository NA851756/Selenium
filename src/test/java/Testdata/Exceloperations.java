package Testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloperations {
	
	
	
	private static org.apache.poi.xssf.usermodel.XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static org.apache.poi.xssf.usermodel.XSSFCell Cell;

	private static XSSFRow Row;



//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

public static String getCellData(int RowNum, int ColNum) throws Exception{
	
	

		// Open the Excel file

	FileInputStream ExcelFile = new FileInputStream(".\\src\\test\\resources\\TestData\\2B871440.xlsx");

	// Access the required test data sheet

	ExcelWBook = new XSSFWorkbook(ExcelFile);

	ExcelWSheet = ExcelWBook.getSheetAt(0);

	
		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

			}catch (Exception e){

			return"";

			}

}

}


