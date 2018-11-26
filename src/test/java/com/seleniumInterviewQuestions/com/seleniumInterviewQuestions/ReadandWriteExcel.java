package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadandWriteExcel {
	
	public static File src;
	public static FileInputStream fis;
	public static Workbook wb;
	public static Sheet sh1;

	public static void main(String[] args) {
		
		try {
			  // Specify the path of file
			  src=new File(".\\src\\main\\java\\com\\newtour\\qa\\testdata\\Demout_Tour.xlsx");
			 
			   // load file
			  fis=new FileInputStream(src);
			 
			   // Load workbook
			  wb = WorkbookFactory.create(fis);
			   
			   // Load sheet- Here we are loading first sheetonly
			      sh1= wb.getSheetAt(0);
			 
			  // getRow() specify which row we want to read.
			 
			  // and getCell() specify which column to read.
			  // getStringCellValue() specify that we are reading String data.
			 // to read numeric data  use below code::
			 //     int data= (int)wb.getSheetAt(0).getRow(0).getCell(1).getNumericCellValue();
			 
			 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			 
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
		
	}
	}
}
