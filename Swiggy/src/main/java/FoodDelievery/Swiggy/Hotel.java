package FoodDelievery.Swiggy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet; //change sl to ss


public class Hotel extends Bill {
	

	
//	String[] Hotels = {"Pandian Hotel","Chettinadu Hotel","Kaienthi Bavan","A2B"};
//
//	public boolean HotelName(String SelectedHotel) throws IOException
//	{	
//		A2B obj = new A2B();
//		obj.fileReadA2B();	
//		for(int i =0;i<Hotels.length;i++) 
//		{
//			if(SelectedHotel.equalsIgnoreCase(Hotels[i]))
//			{
//				return true;
//			}
//		} 
//		return false; 
//	} 
	
	String filepath = "C:\\Users\\aravi\\eclipse-workspace\\Swiggy\\src\\main\\java\\FoodDelievery\\Swiggy\\Resources\\Hotels.xls";

	
	public void readHotelData() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FIS = new FileInputStream(F); //return byte values
		
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook(FIS); //used to read excel values for .xls format
		Sheet sheeta2b = workbook.getSheet("A2B"); //import Sheet to navigate to the Workbook
		int totalRows = sheeta2b.getPhysicalNumberOfRows(); //to get active number of rows
		for(int i=0; i <totalRows; i++)
		{
			Row eachRow = sheeta2b.getRow(i); //to get number of rows
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
	
	
		Sheet sheetBuhari =workbook.getSheet("Buhari");
		int totalRows1 = sheetBuhari.getPhysicalNumberOfRows(); //to get active number of rows
		for(int i1=0; i1 <totalRows1; i1++)
		{
			Row eachRow1 = sheetBuhari.getRow(i1); //to get number of rows
			int totalColumn1 = eachRow1.getLastCellNum();
			for(int j=0;j<totalColumn1;j++) 
			{
				Cell eachCell1=eachRow1.getCell(j);
				if(eachCell1!=null) {
					
					String actualValue = ReadOriginalValue(eachCell1).toString();
					String [] StrActualValue = actualValue.split(" ");
					for(String eachname : StrActualValue)
						{
							System.out.print(eachname + "\t");
						}
					
					//System.out.print(actualValue);
					System.out.print(" ");
//					String actualValue1 = eachCell1.getStringCellValue();
//					//int actualValues = (int) eachCell.getNumericCellValue();
//					System.out.println(actualValue1);
//					//System.out.println(actualValues); 
				}
			}
			System.out.println("");
			
			}
		System.out.println("");
		
		FIS.close();
		}
	
	
	public void KaienthiBhavan() throws IOException {
		
		{
			File F = new File(filepath);
			FileInputStream FIS = new FileInputStream(F); //return byte values
			
			@SuppressWarnings("resource")
			HSSFWorkbook workbook = new HSSFWorkbook(FIS); //used to read excel values for .xls format
			Sheet shkb = workbook.getSheet("KaienthiBhavan"); //import Sheet to navigate to the Workbook
			int totalRows2 = shkb.getPhysicalNumberOfRows(); //to get active number of rows
			for(int i=0; i <totalRows2; i++)
			{
				Row eachRow = shkb.getRow(i); //to get number of rows
				int totalColumn2 = eachRow.getLastCellNum();
				for(int j=0;j<totalColumn2;j++) 
				{
					Cell eachCell2=eachRow.getCell(j);
					if(eachCell2!=null) 
					{
						String actualValue = ReadOriginalValue(eachCell2).toString();
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
			System.out.println("");}
		
		
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
	
}
	
