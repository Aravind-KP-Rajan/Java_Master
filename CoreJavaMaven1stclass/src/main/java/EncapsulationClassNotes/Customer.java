package EncapsulationClassNotes; //Encapsulation Example

public class Customer extends BankAccount
{

	public void GetAccountnumber()
	{
		System.out.println(GetAccNo());
		SetAccNo(111111);
		System.out.println(GetAccNo());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.GetAccountnumber();
		c.GetStatement();
	}

}
