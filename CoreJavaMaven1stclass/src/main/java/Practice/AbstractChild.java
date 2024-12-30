package Practice;

public class AbstractChild extends AbstractParent {
	
	public void subtract()
	{
		int a = 5;
		int b = 4;
		System.out.println(a-b);
	}
	
	@Override
	public void multiply() 
	{
		// TODO Auto-generated method stub
		
		int a = 10;
		int b= 20;
		int c= a*b;
		System.out.println(c);
	}
	
	
	
	public void add() {
		int a = 20;
		int b= 20;
		int c= a+b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractParent obj = new AbstractChild();
		AbstractChild obj1 = new AbstractChild();
		obj.add();
		obj1.add();
//		obj.multiply();
//		obj.subtract();
	}



	

}
