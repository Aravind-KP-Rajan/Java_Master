package Practice;

public class operator {


	public int opera(int a, int b){
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	public void differnce (int a, int b, int d)
	{
		int  f = opera (a,b);
		int e = d-f;
		System.out.println(e);
	}
	
	public String hotelname()
	{
		String names = ("a2b");
		System.out.print(names);
		return names;  
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operator OP = new operator();
		OP.opera(2, 40);
		OP.differnce(2, 40, 50);
		
	

	}

}
