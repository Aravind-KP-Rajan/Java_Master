package Practice;


public class Pyramid {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		  
			//i for rows and j for columns      
			//row denotes the number of rows you want to print  
			int i, j, row = 5;      
			//Outer loop work for rows  
			for (i=0; i<row; i++)   
			{  
			//inner loop work for space      
				for (j=row-i; j>1; j--)   
				{  
				//prints space between two stars  
				System.out.print(" ");   
				}   
			
			
				//inner loop for columns  
				for (j=0; j<=i; j++ )   
				{   
				//prints star      
				System.out.print("* ");   
				}   
			//throws the cursor in a new line after printing each line  
			System.out.println();   
			} 
			
			int a, b, rows=5;{
				for (a=0; a<rows; a++)
				{
					for(b=rows-a; b>1; b--)
					{
						System.out.print(" ");  
					}
					for(b=0; b<=a; b++)
					{
						System.out.print("* ");  
					}
					System.out.println();
				}
			}
	
	}
	}
	
	

