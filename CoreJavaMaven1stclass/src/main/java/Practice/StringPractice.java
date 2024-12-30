package Practice;

public class StringPractice {
	
	String name1 = "Aravindha Rajan";
	String name2 = " Pilot Aravind  ";
	String name3 = "Hari";
	int id = 20;
	
	public void stringConcept()
	{
		System.out.println("name is: " + name1);
		System.out.println();
		System.out.println("Length of name is: "+ name1.length()); // length starts from 1
		System.out.println();
		System.out.println("name in UPPER CASE: " + name1.toUpperCase());
		System.out.println();
		System.out.println("name in lower case: " + name1.toLowerCase());
		System.out.println();
		System.out.println("trims the before and after space :" + name2.trim());
		System.out.println();
		System.out.println("to replace the value :" + name2.replace("\s", "")); //-> "\s" is used to remove the spaces in-between.
		System.out.println();
		System.out.println("The character position in name: " + name3.charAt(0)); //index starts from 0
		System.out.println();
		System.out.println("substring: "+ name1.substring(3, 7)); //throws error if there is incorrect value & starts from zero
		System.out.println();
		System.out.println("substring: "+ name3.substring(1,4)); //displays string at 1st position and up to 3rd position from Hari -> ari
		System.out.println();
		System.out.println("substring: "+ name2.substring(3));
		System.out.println();
		System.out.println("index value is: "+name2.indexOf('A'));
		System.out.println();
		System.out.println("Int to String is: " +String.valueOf(id)+id); //converts integer to string. operation not performed		
		System.out.println();
		
		char[] convert = name3.toCharArray(); //covert string to character
		for(char eachchar: convert)
		{
			System.out.print(eachchar+" "); 
		}
		
		System.out.println();
		
		
		String[] aftersplit = name1.split("r"); // it splits the value from the given letters
		for(String eachname: aftersplit)
		{
			System.out.println(eachname.length()); 
		}
		String[] aftersplit1 = name1.split("ra");
		for(String eachname: aftersplit1)
		{
			System.out.println(eachname);
		}
		
		System.out.println();

		
		
		//TO COMPARE TWO STRING VALUES:
		
		System.out.println(name1.equals(name2)); //returns boolean value - T/F
		System.out.println();
		System.out.println(name2.equalsIgnoreCase(name1)); //returns boolean value - T/F
		System.out.println();
		System.out.println(name1.compareTo(name1)); //returns 0 if same or negative values if not same
		System.out.println();
		System.out.println(name1.compareToIgnoreCase(name2)); //returns 0 if same or negative values if not same
		System.out.println();
		System.out.println(name1== name2); //returns boolean value - T/F
		System.out.println();
		System.out.println(name1.concat(name2)); // similar to name1+name2.
		System.out.println();
		System.out.println(name2.contains("a")); //returns boolean value - T/F
		System.out.println();
		System.out.println(name1.startsWith("A"));
		System.out.println();
		System.out.println(name3.endsWith("i"));
		System.out.println();
		
		
		
		System.out.println(name3.getBytes());
		for(byte eachValue : name3.getBytes() )
		{
			System.out.println(eachValue);	
		}
		System.out.println();

		
		System.out.println(name1.indexOf('i'));
		
		System.out.println();

		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringPractice s = new StringPractice();
		s.stringConcept();
		
	}

}
