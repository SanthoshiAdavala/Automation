package Demos;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readExcel();

	}
	
	public static void readExcel(){
		String filename="D:\\JavaPractice\\SeleniumTraining\\src\\Resources\\Book1.xlsx";
		String[][] data = Utilities.Excl.getData(filename);
	
		System.out.println(data.length);
		
			
		for (String[] record : data){
			System.out.println("\nNewRecord");
			for (String cells : record){
				System.out.println(cells);
			}
			
			
		//	System.out.println(record[1]);
			
		}
		
		
	}

}
