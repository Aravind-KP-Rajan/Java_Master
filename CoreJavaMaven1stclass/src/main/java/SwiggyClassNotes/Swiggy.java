package SwiggyClassNotes;

import java.io.IOException;

public class Swiggy extends Hotel{


	public void Order(String hotelName,String expectedItem,int quantity) throws IOException
	{
		ReadHotelItemInfo R = new ReadHotelItemInfo();
		boolean HotelStatus= R.ReadHotelExist("Hotel",hotelName);
		if(HotelStatus)
		{
			System.out.println("The Given Hotel is Avaialable . Please place your order");
																							//String[] Items = {"Idly-5","Dosa-40","Poori-55","CB-250","MB-350"};
																				
																							//String ItemExist = GetItem(expectedItem,Items);
			String ItemExist =GetItemExistWithPrice(R.ReadItemExist(hotelName, expectedItem));
			if(!ItemExist.equalsIgnoreCase(notExist))
			{
				int price = Integer.parseInt(ItemExist);
				int TotalPrice = GetTotalAmount(price,quantity);
				double AfterDiscount = GetDiscount(TotalPrice);
				double FinalAmountafterTax = GetTax(AfterDiscount);
				System.out.println("You are ording  "+quantity+ " quantity");
				System.out.println("The given Item Price is: "+TotalPrice);
				System.out.println("After your discount : "+AfterDiscount);
				System.out.println("After the Tax ,You have to pay: "+FinalAmountafterTax);
			}
		}
		else
		{
			System.out.println("The Given Hotel is  not Avaialable at the moment. Please try after some time");

		}
	}
	public static void main(String[] args) throws IOException
	{
		Swiggy s = new Swiggy();
		s.Order("Noor","Cbiryani",4);
	}

}
