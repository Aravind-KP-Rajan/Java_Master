package Practice;

public class ConditionExercise { 
	
	public static void condition(int age, String citizenship)  
	
	{
		if(age >= 18 && citizenship == "INDIAN") 
		{
			System.out.println("You're eligible for Voting"); 
				 
		}
		else if (age<18 && (citizenship == "INDIAN"))
		{
			int cal = 18-age;
			System.out.println("You're eligible for Voting after " + cal+" years"); 
		}
		else 
		{
			System.out.println("You're not eligible for Voting");
		}
	}
	
	public void alphabet(String Alphabets)
	{
		
		switch (Alphabets)
		{
		    case "A":
			     System.out.println("1 is correct");
			     break;
			case "B":
				System.out.println("2 is correct");
				break;
			default:
				System.out.println("This is not a valid number");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ConditionExercise CN= new ConditionExercise();
		ConditionExercise.condition(17, "INDIAN");
		//CN.alphabet("A");
		
		 
	}

}
