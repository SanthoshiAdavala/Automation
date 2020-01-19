package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public void readexcelData(String filePath, String fileName, String Sheetname) throws IOException {
		try {
		File file = new File(filePath +"\\"+ fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(inputStream);
		Sheet st = wb.getSheet(Sheetname);
		int rowCount = st.getLastRowNum();// - st.getFirstRowNum();
		System.out.println(rowCount);
		
			for (int i=0 ;i <= rowCount; i++){
				
				Row row =st.getRow(i);
				for (int j=0; j < row.getLastCellNum(); j++){
					
					System.out.println(row.getCell(j).getStringCellValue());
				}
				System.out.println();
				wb.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
