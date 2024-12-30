package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Outputfile {

	String fileoutpath = "C:\\Users\\sathishkumar\\eclipse-workspace\\CoreJava8AMBesantTambaram\\Output\\result.txt";
	String textToPrint = "sathish Kumar R bESANT TECHNOLOGY";

	public void fileout() throws IOException
	{
		@SuppressWarnings("unused")
		File f = new File(fileoutpath);
		@SuppressWarnings({ "unused", "resource" })
		FileWriter fw=new FileWriter(fileoutpath);
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
