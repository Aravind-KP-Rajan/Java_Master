package EncapsulationClassNotes;

public class EnumAccess {

	public void GenderExist(String actualGender)
	{
		Gender FemaleVariable = Gender.FEMALE;
		System.out.println(FemaleVariable);
		System.out.println(actualGender.toUpperCase());
		if(FemaleVariable.toString().equals(actualGender.toUpperCase()))
		{
			System.out.println("You are Female");
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumAccess e = new EnumAccess();
		e.GenderExist("Female");
	}

}
