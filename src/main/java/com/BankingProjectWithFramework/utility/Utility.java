package com.BankingProjectWithFramework.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.BankingProjectWithFramework.base.BaseClass;

public class Utility extends BaseClass {
	
FileInputStream fileInputStream;
	
	public Utility() {
		try {
			this.fileInputStream = new FileInputStream(projectpath+"\\src\\test\\resources\\Excel\\bankingweb.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public void getAllExcelSheetData(String sheetName) throws EncryptedDocumentException, IOException {
		Sheet sh = WorkbookFactory.create(fileInputStream).getSheet("Sheet1");
		HashMap<String, Object> hmap = new HashMap<>();
		for(int i=0; i<=sh.getLastRowNum();i++) {
			int cellCount = sh.getRow(i).getLastCellNum();
			for(int j=0; j<cellCount;j++) {
				if(sh.getRow(i).getCell(j).getCellType().toString().equalsIgnoreCase("string")) {
					sh.getRow(i).getCell(j).getStringCellValue();
				}
				else if(sh.getRow(i).getCell(j).getCellType().toString().equalsIgnoreCase("numreic")) {
					sh.getRow(i).getCell(j).getNumericCellValue();
				}
			}
		}
		
	}
	
	
	
	public Object getSingleCellDataFromExcel(int row, int cell,String sheetName) throws EncryptedDocumentException, IOException {
		
		Sheet sh = WorkbookFactory.create(fileInputStream).getSheet("Sheet1");
		Object data = "";
		
		if(sh.getRow(1).getCell(cell).getCellType().toString().equalsIgnoreCase("string"))
			data = sh.getRow(row).getCell(cell).getStringCellValue();
		else if(sh.getRow(row).getCell(cell).getCellType().toString().equalsIgnoreCase("numeric"))
			data = sh.getRow(row).getCell(cell).getNumericCellValue();
		return data;
	}

}


