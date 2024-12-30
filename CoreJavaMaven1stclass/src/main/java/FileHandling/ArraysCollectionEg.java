package FileHandling;

public class ArraysCollectionEg {

	String[] name= {"sathish","raja","vicky","dinesh"};

	int[] age = new int[5]; // intialize an array

	public void Arraysimplementation()
	{
		System.out.println(name[2]);
		System.out.println(age[2]);
		age[4] =5;
		System.out.println(age[2]);

		for(int eachval : age)
		{
			System.out.println(eachval);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysCollectionEg A = new ArraysCollectionEg();
		A.Arraysimplementation();
	}

}
