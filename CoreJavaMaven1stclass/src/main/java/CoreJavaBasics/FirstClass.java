package CoreJavaBasics;

public class FirstClass {
	
	//syntax: accessmodifier returntype methodname(arguments/Parameters){}
	
	
	//1. method without parameter/argument
	//2. method with parameter/return type
	//3. Method without return type
	//4. method with return type
	
	
	
	//1. Method without parameter and without return type
	
	public void myname() {
		String name = "Aravind kp";
		System.out.println(name);
	} //method implementation
	
	//2. Method with parameter and without return type
	
	public void mynamewithparam(String name, int age) 
	{
		System.out.println(name);
		System.out.println(age);
	}
	
	//3. Method with parameter and returntype 
	public int multiply(int a, int b) //int-returntype ... Multiply- method name
	{
		int c = a*b;
		return c; 
	}
	
	
	public void div(int a, int b, int denominator)
	{
		int numerator = multiply (a,b); //calling method multiply from above //method return
		int d = numerator/denominator;
		System.out.println(d);
	}
	
	//constructor
	
		//1. it is same as method
		//2. Constructor name should be same as your class name
		//3. Constructor should not have any return type
		//4. constructor have 2 types 
		//     4.1. 	constructor without parameter/arguments
	    //     4.2. 	constructor with parameter/arguments
		//5. constructor will be automatically called when we instantiate 
		
		public FirstClass() { // void is not used (point no 2.)
			
		}
		
		//parameterized constructor
		public FirstClass (int a, int b) {
			
			int c= a+b;
			System.out.println("This is constructor " + c);
			
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My name is: Aravind"); 
		System.out.println("My age is:"+(7*3));
		System.out.println("I am from: Chennai");
		System.out.println("I am studying: Java");
		FirstClass FC = new FirstClass(4,5); // object instantiation // give value here for constructors - to differentiate/call with and without parameter
		FC.myname(); //method call
		FC.mynamewithparam ("john", 30);
		FC.div(5,6,10);
		int res = FC.multiply (5,6);
		System.out.println(res);
		
		
	}

}
