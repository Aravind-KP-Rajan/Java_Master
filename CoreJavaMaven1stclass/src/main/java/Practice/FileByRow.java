package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


//@SuppressWarnings("unused")
public class FileByRow {
	
		String filePath = "C:\\Users\\aravi\\eclipse-workspace\\CoreJavaMaven1stclass\\src\\main\\java\\Practice\\Input\\Students.txt";
		
		//@SuppressWarnings("resource")
		public void ReadData(String str,char c) throws IOException {
			File F = new File(filePath);
			//FileInputStream FIS = new FileInputStream(F);
			FileReader FR = new FileReader(F);
			BufferedReader BR = new BufferedReader(FR);
			String s; 
			int line=1;
			int flag=0;
			int count=0;
			while((s=BR.readLine())!=null) 
			{
				String[] strArr = s.split(" ");
				for(int i=0;i<strArr.length;i++) 
				{
					for(int j=0;j<strArr[i].length();j++)
					{
						if(strArr[i].charAt(j)==c) {
							count++;
						}
					}
					if(strArr[i].equals(str)) 
					{
						System.out.println("given string "+str+" found in line number "+line);
						flag=1;
					}
				}
				line++;
			    //System.out.println(s);
			}
			if(flag==0) 
			{
				System.out.println("given string not found");
			}
			System.out.println("given character "+c+" count is "+count);
			
			/*
			 * int i; while((i=F.read())!=-1) System.out.print((char)i);
			 */
			
			BR.close();
		}

		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileByRow FBR = new FileByRow();
		FBR.ReadData("java",'a');
	}

}
