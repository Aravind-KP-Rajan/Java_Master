package FoodDelievery.Swiggy;

public class Bill  {
	
	
	public int GetItemExistWithPrice(String itemPrice, int quantity) 
			
	{
		int price = Integer.parseInt(itemPrice);
		int amt = price*quantity;
		System.out.println("amount without discount : "+amt);
		return taxCalculation(discount(amt));
	}
	public int discount(int amt) 
	{
		if(amt>=200)
		{
			int disAmount = amt - amt*5/100;
			System.out.println("amount with discount : "+disAmount);
			return disAmount;
		}
		System.out.println("amount with discount : "+amt);
		return amt;
		
	}
	public int taxCalculation(int amt) 
	{
		int taxAmount = amt + amt*3/100;
		System.out.println("amount with tax : "+taxAmount);
		return taxAmount;
	}
		
		
		
	
		
//	public double orderamount ()
//	{
//		int a = 100;
//		int b = 25; // Discount 
//		int c = a-b; 
//		double d = c+13; //final amount
//		return d; 
//	}
	
}