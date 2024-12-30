package Practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileWritePractice {//21stfeb 2024 class
	
	String fileINinPath = "C:\\Users\\aravi\\eclipse-workspace\\CoreJavaMaven1stclass\\src\\main\\java\\Practice\\Input\\Students.txt";	
	String fileOutoutPath = "C:\\Users\\aravi\\eclipse-workspace\\CoreJavaMaven1stclass\\src\\main\\java\\Practice\\Output\\result.txt";
	String fileOutoutPath3 = "C:\\Users\\aravi\\eclipse-workspace\\CoreJavaMaven1stclass\\src\\main\\java\\Practice\\Output\\result3.txt";

	String fileOutoutPath2 = "C:\\Users\\aravi\\eclipse-workspace\\CoreJavaMaven1stclass\\src\\main\\java\\Practice\\Output\\result2.txt";

	String name = "Aravind K P"; //name = string identifier
	String name1 = "Aravind K P Rajan";
	
	public void writeMethod() throws IOException
	{
		File F = new File(fileOutoutPath);
		FileOutputStream FOS = new FileOutputStream(F);
		FOS.write(name.getBytes());
		FOS.close();
		System.out.println("done");
	}
	
	public void writeWithoutConversion() throws IOException {
		File F = new File(fileOutoutPath2);
		FileWriter FWR = new FileWriter(F);
		FWR.write(name1);
		FWR.close();
		System.out.println("done");	
	}
	
	public void copyPaste() throws IOException {
		
		File sourcefile = new File (fileINinPath);
		File destinationfile = new File (fileOutoutPath3);
		FileUtils.copyFile(sourcefile, destinationfile);
		System.out.println("done");
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWritePractice FWP = new FileWritePractice();
		FWP.writeMethod();
		FWP.writeWithoutConversion();
		FWP.copyPaste(); 
	}

}
