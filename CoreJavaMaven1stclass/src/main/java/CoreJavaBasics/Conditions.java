package CoreJavaBasics;

public class Conditions {
	
	public void conditionsimplementation (String color, String vehicle)
	
	{
		if(color == "red") 
		{
			if (vehicle=="ambulance") 
			{
				System.out.println("You have to go");
			}
			System.out.println("You have to stop");
		}
		else if (color=="orange")
		{
			System.out.println("You are ready to go/stop");
		}
		else if(color == "green")		//use else-if condition if need to check another condition
		{
			System.out.println("You have to go");
		}
		else
		{
			System.out.println("This is not a valid color");
		}
	}
	
	
	
	
	//SWITCH CONDITION
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions C = new Conditions();
		C.conditionsimplementation ("red", "car");
		
		

	}

}
