package Practice;

//import java.util.Scanner;

public class StringFilePactice {
	
	public void FileName(String name)
	{
		int value = name.indexOf('.');
		System.out.print("The given file format is : "+name.substring(value+1) + " file");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan =new Scanner(System.in);
//		String Filename = scan.nextLine();
//		
//		int value = Filename.indexOf('.');
//		System.out.println("The given file format is : "+Filename.substring(value) + " file");
	
		StringFilePactice F = new StringFilePactice();
		F.FileName("Aravind.java");
	}

}