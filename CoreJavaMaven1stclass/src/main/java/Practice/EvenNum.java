package Practice;

public class EvenNum {
	
	public void num(int num) {
		if(num%2==0)
		{
			System.out.println("The give number is even");
			
		}
		else {
			System.out.println("the given number is odd");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNum obj = new EvenNum();
		obj.num(341);
	}

}
