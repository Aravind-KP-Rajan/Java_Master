package Practice;

public class PyramidPractice {
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i, j , rows =5;
		for(i=0; i<rows; i++)
		{
			for(j=rows-i; j>1; j--)	
			{
				System.out.print(" ");
			}
			for(j=0; j<=i;j++)
			{
				System.out.print(" *");
			}
		System.out.println();
		}
	}

}