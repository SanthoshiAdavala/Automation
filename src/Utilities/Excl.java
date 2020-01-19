package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excl 
{
	//String filename="D:\\JavaPractice\\SeleniumTraining\\src\\Resources\\Book1.xlsx";
	public static String[][] getData(String filename)
	{
		String[][] dataTable = null;
		File file = new File(filename);
		try{
			FileInputStream inputstream = new FileInputStream(file);
			XSSFWorkbook xlbook = new XSSFWorkbook(inputstream);
			XSSFSheet sheet = xlbook.getSheetAt(0);
			
			int rowCount = sheet.getLastRowNum() + 1;
			int colCount = sheet.getRow(0).getLastCellNum();
			dataTable = new String[rowCount][colCount];
			
			for (int i=0; i < rowCount; i++){
				XSSFRow row = sheet.getRow(i);
				for (int j=0 ; j<colCount ; j++){
				XSSFCell cell = row.getCell(j);
				dataTable[i][j]=cell.toString();
				}
			
			}
			xlbook.close();
			}
		catch (IOException e){
			System.out.println("ERROR:" + e.toString());
			
		}
		return dataTable;
		}
		
	}
