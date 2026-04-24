package day9;

public class Grocery {

	public static void main(String[] args) {
		String item = "Rice";
		int qty = 25;
		double price = 1650.0;
		int member = 1;
		
		double subtotal=qty*price;
		double discount = 0;
		
		if(member == 1)
		{
			discount =subtotal *0.10;
		}
		double amount = subtotal - discount;
		double gst;
		
		if(amount > 500)
		{
			gst = amount *0.05;
		}
		else 
		{
			gst = amount *0.12;
		}
		
		double total = amount +gst;
		
		System.out.println("item:" +item);
		System.out.println("subtotal:" +subtotal);
		System.out.println("discount:" +discount);
		System.out.println("gst:" +gst);
		System.out.println("total:" +total);
		
			
			
			
			
			
	
		
		// TODO Auto-generated method stub

	}

}
