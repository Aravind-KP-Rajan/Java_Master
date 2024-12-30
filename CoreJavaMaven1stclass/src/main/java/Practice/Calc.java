package Practice;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		
		
		
		int ans =0;
		
		while(true)
		{
			System.out.println("Enter the operator: ");
			
			char opr = in.next().trim().charAt(0);
			if(opr=='+'||opr=='-'||opr=='%'||opr=='*'||opr=='/');
			{
				
				System.out.println("Enter two numbers: ");
			
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			
			if(opr=='+') {
				
				 ans = num1+num2;
			}
			if(opr=='-') {
				
				 ans = num1-num2;
			}
			if(opr=='*') {
				
				 ans = num1*num2;
			}
			if(opr=='/') {
				if (num2!=0) {
					 ans = num1/num2;
				}
			}
			if(opr=='%') {
				
				ans = num1%num2;
			}
		System.out.println(ans);	
		}
			
		}
			
	}

}
