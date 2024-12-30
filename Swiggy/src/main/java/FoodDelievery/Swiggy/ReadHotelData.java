package FoodDelievery.Swiggy;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ReadHotelData {
	
	String filepath = "C:\\Users\\aravi\\eclipse-workspace\\Swiggy\\src\\main\\java\\FoodDelievery\\Swiggy\\Resources\\Hotels.xls";

	public boolean readHotelData(String sheetName, String hotelName) throws IOException
	{
		File F =new File(filepath);
		FileInputStream FIS = new FileInputStream(F);
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook(FIS);
		Sheet sh = workbook.getSheet(sheetName);
		int totalRows = sh.getPhysicalNumberOfRows();
		for(int i=0; i<totalRows;i++)
		{
			Row eachRow = sh.getRow(i);
			@SuppressWarnings("unused")
			int totalColumn = 1;
				for(int j = 0; j<totalRows;j++)
				{
					Cell eachCell= eachRow.getCell(j);
					if(eachCell!=null) 
					{
						String actualValue =  ReadDataAsSuch(eachCell).toString();
						if(actualValue.equalsIgnoreCase(hotelName))
						{
							System.out.println(hotelName);
							Cell addressCell = eachRow.getCell(1);
							Cell hotelNameCell = eachRow.getCell(2);
							String addressValue = ReadDataAsSuch(addressCell).toString();
							String hotelNameValue = ReadDataAsSuch(hotelNameCell).toString();
							System.out.println("Hotel Name is : "+ hotelNameValue);
							System.out.println("Address is : "+ addressValue);
							return true;

						}
					}
				}
		}
		FIS.close();
		return false;
	}
	
	
	public String readItemData(String sheetName, String itemName) throws IOException 
	{
		File F = new File(filepath);
		FileInputStream FIS = new FileInputStream(F);
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook(FIS);
		Sheet sh = workbook.getSheet(sheetName);
		int totalRows = sh.getPhysicalNumberOfRows();
		for(int i=0;i<totalRows; i++) 
		{
			Row eachRow = sh.getRow(i);
			@SuppressWarnings("unused")
			int totalColumn = 1;
				for(int j=0; j<totalRows;j++)
				{
					Cell eachCell = eachRow.getCell(j);
					if(eachCell!=null)
					{
						String eachCellValue = ReadDataAsSuch(eachCell).toString();
						if(eachCellValue.equalsIgnoreCase(itemName))
								{
									System.out.println(itemName);
									Cell priceCell = eachRow.getCell(1);
									//String priceCellValue = ReadDataAsSuch(priceCell).toString();
									String hotelNameValue = ReadDataAsSuch(priceCell).toString();
									System.out.println("The Item Price is : "+hotelNameValue);
									return hotelNameValue;
									
								}
						System.out.println(" ");
					}
				}
		}
		FIS.close();
		return null;
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
}