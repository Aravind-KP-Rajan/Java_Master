package ClassNotes;

public class StringsConcept {

	String name= " Sathish kumar R ";
	String name1= " besant technilogy";
	int age =30;
	
	int age1 = 32;
	String name2= "Sathish kumar R";
	String name3= "Sathish kumar R";

	public void Stringimplementation()
	{
		System.out.println(name2.equals(name3));
		System.out.println(age+age1);
		System.out.println(String.valueOf(age)+age1);
		System.out.println(age+age1);
		System.out.println(name);
		System.out.println(name.length()); 
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name);
		System.out.println(name.replace(" ", ""));
		System.out.println(name.replace("\s", ""));
		System.out.println(name.charAt(3));
		System.out.println(name.substring(3,6));
		System.out.println(name.substring(3));
		System.out.println(name.indexOf('t'));
		System.out.println(String.valueOf(age));
		
		
		char[] convert = name.toCharArray();
		for(char eachChar : convert)
		{
			System.out.println(eachChar);
		}

		
		String[] aftersplit = name.split("a");

		for(String eachname : aftersplit)
		{
			System.out.println(eachname);
		}

		System.out.println(aftersplit.length);


		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name==name1);
		System.out.println(name.concat(name1));
		System.out.println(name+name1);
		System.out.println(name.contains("th"));
		System.out.println(name.startsWith(" sa")); 
		System.out.println(name.endsWith("h"));
		System.out.println(name.getBytes());

		for(byte eachvalue : name.getBytes())
		{
			System.out.println(eachvalue);
		}

		System.out.println(name.indexOf('a',5));

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringsConcept s = new StringsConcept();
		s.Stringimplementation();
	}

}
