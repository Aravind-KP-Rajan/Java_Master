package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TextFileWrite {
	String fileinpath = "C:\\Users\\sathishkumar\\eclipse-workspace\\CoreJava8AMBesantTambaram\\Input\\Students.txt";
	String fileoutpath = "C:\\Users\\sathishkumar\\eclipse-workspace\\CoreJava8AMBesantTambaram\\Output\\besant.txt";


	String textToPrint = "sathish Kumar R bESANT TECHNOLOGY";

	public void WriteData() throws IOException
	{
		File f = new File(fileoutpath);
		FileOutputStream FS = new FileOutputStream(f);
		//	FS.write(115);
		//	FS.write(100);
		FS.write(textToPrint.getBytes());
		FS.close();
		System.out.println("Done");

	}

	public void ReadandWrite() throws IOException
	{
		/*
		 * inputfilepath
		 * open input file = File class
		 * use file reader + buffered reader
		 * output filepath
		 * open output file
		 * Write in to output file
		 * continue read and write for all the  rows
		 * close the output stream
		 */
		File inf = new File(fileinpath);
		File ouf = new File(fileoutpath);
		FileReader FR = new FileReader(inf);
		FileWriter FS = new FileWriter(ouf);
		BufferedReader BR = new BufferedReader(FR);
		String i;
		while((i=BR.readLine())!=null)
		{
			FS.write(i);
			FS.write("\n");
		}
		FS.close();
		System.out.println("done");
		
		BR.close();
	}

	public void copyPaste() throws IOException
	{
		File sourcefile = new File(fileinpath);
		File DestinationFile = new File(fileoutpath);
		FileUtils.copyFile(sourcefile, DestinationFile);
	}

	public void WriteDataASsTRING() throws IOException
	{
		File f = new File(fileoutpath);
		FileWriter FS = new FileWriter(f);
		//	FS.write(115);
		//	FS.write(100);
		FS.write(textToPrint);
		FS.close();
		System.out.println("Done");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFileWrite T = new TextFileWrite();
		try {
			T.copyPaste();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
