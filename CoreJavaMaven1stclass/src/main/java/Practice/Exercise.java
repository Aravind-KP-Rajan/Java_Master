package Practice;

public class Exercise {
//	
//	public int multiply(int a, int b) {
//		int c= a*b;
//		System.out.println(c); //system.out should be above return value
//		return c;
//		
//	}
	
	public static void main(String[] args) 
	{
            // outer loop to handle number of rows
            //  n in this case
        	int n = 5;
            for (int i=0; i<n; i++)
            {
     
                // inner loop to handle number spaces
                // values changing acc. to requirement
                for (int j=n-i; j>1; j--)
                {
                    // printing spaces
                    System.out.print(" ");
                }
                
                int rows = 5;

        for (int a = 1; i <= rows; a++) 
        {
            for (int j = 1; j <= a; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        int row = 5;

        for (int b = 1; b <= row; b++) 
        {
            for (int j = 1; j <= b; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
//        printName( "Aravind ", 22 );
//    }
//	
//	public static void printName(String name, int age) {
//		System.out.println("my name is "+ name + "Mye age is " + age);	
//	}
//	
	
	}

	}
		
	}
		
//		System.out. println("Aravind");
//		Exercise Ex= new Exercise();
//		Ex.multiply(6,5);
		
		//star practice below code
        //int rows = 5;
        
        
