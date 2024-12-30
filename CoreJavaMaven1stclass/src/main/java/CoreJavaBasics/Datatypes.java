package CoreJavaBasics;

public class Datatypes {
	 
	//DATA TYPES
	// 2 types - primitive and non-primitive
	// primitive - it has fixed size (starts with lower case letters)
	// 1. Whole number - into (keyword) or Integer (class) + accepts only 8 digit
	int a=0123456; //global/instance variable
	// 2. Decimal number - float - one decimal value
	float b=2.1f;  //f is included in last        // not used in realtime bcz double is more compatible
	// 2.2 double - one or more decimal value
	double c = 2.1234567;
	// 3. character - char=1 value
	char d = 'g'; //only one letter is possible - inside single quotes
	// 4. word - String
	String e = "Aravind";
	// 5. true/false - boolean = 2 values
	boolean f = true;
	
	
	
	// non primitive data types - does not have fixed value (starts with upper case letter)
	// 1. class
	// 2. interface 
	// 3. arrays
	
	
	
	
	
	
	// VARIABLES - is a container which holds the value
	
	//1. local variable
	//2. global/instance variable
	//3. static variable
	
	// access modifier data type variableName = value;
	
	int g=0123456; //global/instance variable - outside the method but inside the class
	static int h=0123456;  //static variable
	
	public void printa () {
		int a=10; //here a is variable which contains the value 10
		System.out.println(a); //local variable
	}
	
	
	//ACCESSMODIFIER
	// 1. private 
	// 2. protected 
	// 3. public 
	// 4. default

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
