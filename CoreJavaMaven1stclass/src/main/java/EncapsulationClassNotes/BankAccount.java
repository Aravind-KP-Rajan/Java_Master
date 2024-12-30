package EncapsulationClassNotes; //Encapsulation example

public class BankAccount {


	private int accno = 10101010;

	public int GetAccNo()
	{
		return accno;
	}

	public void SetAccNo(int accno)
	{
		this.accno=accno;
	}

	public void GetStatement()
	{
		System.out.println("Your statement will send over an email");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
