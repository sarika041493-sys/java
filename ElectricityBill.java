package day9;

public class ElectricityBill {

	public static void main(String[] args) {
		int units = 300;
		double bill;
		
		if(units <=100) {
			bill= units*1.5;
		}
		else if(units <=200) {
			bill=100*1.5+(units -100)*2.5;
			
		}
		else {
			bill= 100*1.5 + 100 *2.5 +(units -200)*4;
		}
		System.out.println(bill);
		
		// TODO Auto-generated method stub

	}

}
