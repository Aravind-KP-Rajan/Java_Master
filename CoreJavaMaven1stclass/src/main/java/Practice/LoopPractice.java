package Practice;

public class LoopPractice {
	
	public void loop(int maxamount, int withdrawal_amount, int no_of_times)
	{
		
		while(withdrawal_amount*no_of_times<=maxamount && withdrawal_amount>0)
		{
			System.out.println("Your maximum transaction limit per day is " + maxamount + " Rupees.");
			System.out.println("Your present withdrawal amount is " + withdrawal_amount + " Rupees.");
			System.out.println("You'll get "+ withdrawal_amount*no_of_times + " Rupees " + "for " + no_of_times  + " no.of transaction.");
			break;
		}
			
			if (withdrawal_amount*no_of_times>maxamount)
			{	
				System.out.println("Amount exceeds the maximum limit of " + maxamount + " Rupees." );
			
			}
			
			else if(withdrawal_amount<1)
			{
				System.out.println("Minimum amount to be withdrawl is 1 rupees");
			}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopPractice obj = new LoopPractice();
		obj.loop(100000, 10001, 1); 
	}

}
