package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TextfileRead {

	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\CoreJava8AMBesantTambaram\\Input\\Students.txt";

	public void ReadData() throws IOException
	{
		File f = new File(filepath);
		FileInputStream FS = new FileInputStream(f);
		int i;
		while((i=FS.read())!=-1)
		{
			System.out.print((char)i);
		}
		FS.close();
	}

	public void ReadDatawithFileReader() throws IOException, InterruptedException
	{
		File f = new File(filepath);
		@SuppressWarnings("resource")
		FileReader FS = new FileReader(f);
		int i;
		while((i=FS.read())!=-1)
		{
			System.out.print((char)i);
			Thread.sleep(500);
		}
	}

	public void ReadDatawithBufferedReader() throws IOException, InterruptedException
	{
		File f = new File(filepath);
		FileReader FS = new FileReader(f);
		BufferedReader BF = new BufferedReader(FS);
		String i;
		while((i=BF.readLine())!=null)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		BF.close();
	}


	public static void main(String[] args) throws IOException, InterruptedException
	{
		TextfileRead T = new TextfileRead();
		T.ReadDatawithFileReader();
	}

}
