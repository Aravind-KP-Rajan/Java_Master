package ClassNotes;

public class InvoiceNew extends AbsFirstClass{

	@Override
	public void sub()
	{
		int a =10;
		int b=70;
		int c=b-a;
		System.out.println(c);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub

	}

	public void Tax(int amount)
	{
		System.out.println("Your tax amount is : "+amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsFirstClass I = new InvoiceNew();
		InvoiceNew I1 = new InvoiceNew();
		I1.Tax(500);
		I.sub();
	}



}
