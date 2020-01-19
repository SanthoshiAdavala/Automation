package Demos;

import java.io.IOException;

import Utilities.ReadExcelData;

public class ReadDataxl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Utilities.ReadExcelData readdata = new ReadExcelData();
		String filePath ="D:\\JavaPractice\\SeleniumTraining\\src\\Resources";
		readdata.readexcelData(filePath, "Book1.xlsx", "Sheet1");
		

	}

}
