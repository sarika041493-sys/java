package lab3;

import java.util.Scanner;

public class Bank {
	double amount;
	
	// constructor creation
	Bank(double amount){
		this.amount=amount;
	}
	
	// withdraw() using ternary operator
	 void withdraw(double withdrawlAmount) {
		 String message = (withdrawlAmount <= amount)? "Withdrawl Successful" : "Insufficient balance";
		 System.out.println(message);
		 
		 if(withdrawlAmount <= amount) {
			 amount = amount-withdrawlAmount; // update balance
		 }
	 }
	 
	 // deposit() using ternary operator
	 void deposit(double depositAmount) {
		 amount = amount+ depositAmount;
	 }
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the amount: ");
		double initialAmount= sc.nextDouble();
		
		Bank b = new Bank(initialAmount); // amount = 10000//object creation
		
		 System.out.print("Enter withdrawl amount: ");// withdrawl amount
		 double w =sc.nextDouble();
		 b.withdraw(w);
		 
		System.out.print("Enter deposit amount: ");// deposit amount
		double d = sc.nextDouble();
		b.deposit(d);
		
		System.out.println("Deposit amount=" +d);
		
		System.out.println("Total balance=" +b.amount);// total balance
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
