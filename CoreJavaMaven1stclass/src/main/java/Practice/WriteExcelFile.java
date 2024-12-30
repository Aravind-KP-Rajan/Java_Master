package Practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {
	
	String filepath = "C:\\Users\\aravi\\eclipse-workspace\\CoreJavaMaven1stclass\\src\\main\\java\\Practice\\Output\\StudentResults.xlsx";
	//String[] name = {"Aravind", "John", "Joseph"};
	
	public void writeData() throws IOException
	{
		File f = new File(filepath);
		FileOutputStream FO = new FileOutputStream(f);
		//@SuppressWarnings("resource")
		XSSFWorkbook wbk = new XSSFWorkbook();
		Sheet sh = wbk.createSheet("Result");
		Row eachRow = sh.createRow(0);
		Cell eachCell = eachRow.createCell(0);
		eachCell.setCellValue("Aravind");
		wbk.write(FO);
		System.out.println("Done");
		wbk.close();
		
	}
	
	
//	public void writeDataWithArray()
//	{
//		int totalArray = name;
//		for(int i = 0; i<totalArray;i++)
//		{
//			Cell eachCell = eachRow.createCell(i);
//			eachCell.setCellValue(name[i]);
//			
//		}
//	}
//	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteExcelFile obj = new WriteExcelFile();
		obj.writeData();
			
	}

}
