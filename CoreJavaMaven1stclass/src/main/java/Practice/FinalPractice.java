package Practice;

public class FinalPractice {

	class bike{
	
	void runs() 
		{
			System.out.println("final method");
		}
	}

	class honda extends bike 
		{
			void runs() {
			System.out.println("final methodss");	
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		FinalPractice obj = new FinalPractice();
		obj.runs();
		
		
		int num = 4;
		System.out.println(num);
	}
	private void runs() {
		// TODO Auto-generated method stub
		
	}
	

}
