package FileHandling;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelfileRead {

	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\CoreJava8AMBesantTambaram\\Input\\StudentData.xlsx";


	public void ReadData() throws IOException
	{
		/*
		 * File open and open the I/P stream
		 * Navigate to sheet
		 * Get Total used row
		 * Get Total used column
		 * Navigate to the cell using row and column
		 * Get the value from the cell
		 * Close the stream
		 */

		File f = new File(filepath);
		FileInputStream FS = new FileInputStream(f);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(FS);
		Sheet sh = workbook.getSheet("Course");
		// total tows
		int totalRows = sh.getPhysicalNumberOfRows();
		for(int i=0;i<totalRows;i++)
		{
			Row eachRow = sh.getRow(i);
			int totalColumns = eachRow.getLastCellNum();
			for(int j=0;j<totalColumns;j++)
			{
				Cell eachCell =eachRow.getCell(j);
				if(eachCell!=null) 
				{
					String actualValue = ReadDataAsSuch(eachCell).toString();
					System.out.print(actualValue);
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		FS.close();
	}


	public Object ReadDataAsSuch(Cell cellValue)
	{
		if(cellValue.getCellType()==CellType.STRING)
		{
			return cellValue.getStringCellValue();
		}
		else if(cellValue.getCellType()==CellType.NUMERIC)
		{
			DataFormatter data =  new DataFormatter();
			return data.formatCellValue(cellValue);
			//return cellValue.getNumericCellValue();
		}
		return null;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelfileRead E = new ExcelfileRead();
		E.ReadData();
	}

}
