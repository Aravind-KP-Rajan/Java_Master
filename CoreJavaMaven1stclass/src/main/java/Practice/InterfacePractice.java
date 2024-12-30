package Practice;

public class InterfacePractice extends operator implements Interface1, Interface2 {

	public void fata() {
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		InterfacePractice obj = new InterfacePractice();
		System.out.println(obj.opera(5, 6));	
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
