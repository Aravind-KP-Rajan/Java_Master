package FoodDelievery.Swiggy;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

//import javafx.scene.control;



public class A2B extends Bill
{
	//String[] A2Bitems = {"Idly-30", "Poori-40", "Dosa-50", "Pongal-50", "Chappathi-40"};
	//String filepathA2B = "C:\\Users\\aravi\\eclipse-workspace\\Swiggy\\src\\main\\java\\FoodDelievery\\Swiggy\\Hotels\\A2B.properties";
	String filepath = "C:\\Users\\aravi\\eclipse-workspace\\Swiggy\\src\\main\\java\\FoodDelievery\\Swiggy\\Resources\\Hotels.xls";

	public void fileReadA2B() throws IOException
	{
		
		String filepathA2B = "C:\\Users\\aravi\\eclipse-workspace\\Swiggy\\src\\main\\java\\FoodDelievery\\Swiggy\\Hotels\\A2B.properties";		
		File F = new File(filepathA2B);
		FileReader FR = new FileReader(F);
		@SuppressWarnings("unused")
		BufferedReader BR = new BufferedReader(FR);
		Properties p = new Properties();
		p.load(FR);
		System.out.println(p.getProperty("A2B"));

	}
	
	public void item(String OrderedItem)
	{ 
	/*
	 * for(String s : A2Bitems) //why this method? { String[] aftersplit =
	 * s.split("-"); int amt = Integer.parseInt(aftersplit[1]); for(String st :
	 * aftersplit) System.out.println(st); }
	 * 
	 * // // for(String eachname : aftersplit) // { // System.out.println(eachname);
	 * // } // { for (int i=0; i<A2Bitems.length; i++) {
	 * if(OrderedItem.equalsIgnoreCase(A2Bitems[i])) { return true; } } return
	 * false; } }
	 */
//		String[] aftersplit = A2Bitems.("-");
//
//		for(String eachname : aftersplit)
//		{
//			System.out.println(eachname);
//		}
//	}
	}
	
	public void readHotelDataa() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FIS = new FileInputStream(F); //return byte values
		
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook(FIS); //used to read excel values for .xls format
		Sheet sha2b = workbook.getSheet("A2B"); //import Sheet to navigate to the Workbook
		int totalRows = sha2b.getPhysicalNumberOfRows(); //to get active number of rows
		for(int i=0; i <totalRows; i++)
		{
			Row eachRow = sha2b.getRow(i); //to get number of rows
			int totalColumn = eachRow.getLastCellNum();
			for(int j=0;j<totalColumn;j++) 
			{
				Cell eachCell=eachRow.getCell(j);
				if(eachCell!=null) 
				{
					String actualValue = ReadOriginalValue(eachCell).toString();
					System.out.print(actualValue+ "\t");
					System.out.print(" ");
					
					//String actualValue = eachCell.getStringCellValue();
					//int actualValues = (int) eachCell.getNumericCellValue();
					//System.out.println(actualValue);
					//System.out.println(actualValues);
				}
			}
			System.out.println("");
			
		}
		System.out.println("");
	}
	
public Object ReadOriginalValue(Cell cellValue) {
		
		if (cellValue.getCellType()==CellType.STRING) 
		{
			return cellValue.getStringCellValue();
		}
		else if (cellValue.getCellType()==CellType.NUMERIC)
		{
			DataFormatter data = new DataFormatter();
			return data.formatCellValue(cellValue);
			//return cellValue.getNumericCellValue(); //it'll return decimal value
		}
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		A2B obj = new A2B();
		obj.item("Idly");
		obj.fileReadA2B();
		obj.readHotelDataa();
		//System.out.println(aftersplit);
	}

}
	
