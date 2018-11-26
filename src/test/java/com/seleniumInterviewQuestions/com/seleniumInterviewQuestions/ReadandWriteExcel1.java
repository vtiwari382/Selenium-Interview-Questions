package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadandWriteExcel1 {
	
	public static File src;
	public static FileInputStream fis;
	public static Workbook wb;
	public static Sheet sh1;

	public static void main(String[] args) {
		try {
			 
			  // Specify the file path which you want to create or write
			 
			  File src=new File(".\\src\\main\\java\\com\\newtour\\qa\\testdata\\Demout_Tour.xlsx");
			 
			  // Load the file
			 
			  FileInputStream fis=new FileInputStream(src);
			 
			   // load the workbook
			 
			   Workbook wb=WorkbookFactory.create(fis);
			 
			  // get the sheet which you want to modify or create
			 
			   Sheet sh1= wb.getSheet("Registration");
			 
			 // getRow specify which row we want to read and getCell which column
			 
			 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			 
			 
			// here createCell will create column
			 
			// and setCellvalue will set the value
			 
			 sh1.getRow(2).createCell(0).setCellValue("Poonam");
			 
			 sh1.getRow(2).createCell(1).setCellValue("Tiwari");
			 
			 sh1.getRow(2).createCell(2).setCellValue("9717");
			 
			 
			// here we need to specify where you want to save file
			 
			 FileOutputStream fout=new FileOutputStream(src);
			 
			 
			// finally write content 
			 
			 wb.write(fout);
			 
			// close the file
			 
			 fout.close();
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
	}

}
