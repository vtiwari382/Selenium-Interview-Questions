package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AdvanceExcelReader {
	
	FileInputStream fis;
	Workbook wb;
	Sheet sheet;
	
	public Object[][] ReadCompleteData() {
		File file = new File(".\\src\\main\\Practice.xlsx");
		try {
			fis = new FileInputStream(file);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
		     wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		sheet = wb.getSheet("Registration");
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());
		
		for(int i=0; i<sheet.getLastRowNum(); i++) {
			for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j);
				System.out.println("fetching saved value of excel sheet " +data[i][j].toString());
			}
		}
		return data;
		
	}

	public static void main(String[] args) {
		AdvanceExcelReader obj = new AdvanceExcelReader();
		obj.ReadCompleteData();

	}

}
