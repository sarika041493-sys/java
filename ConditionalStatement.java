package day3;

public class ConditionalStatement {

	public static void main(String[] args) {
		int m1= 96;
		
		System.out.println("---marks---");
		if(m1>= 80 && m1<=100) {
			System.out.println("marks " +m1 + "=distinction");
		}
		else if(m1>=60 && m1<=80) {
			System.out.println("marks " +m1 + "=First class");
		}
		else if(m1>=35 && m1<=60) {
			System.out.println("marks " +m1 + "=Second class");
		}
		else if(m1>=0 && m1<=34) {
			System.out.println("marks " +m1 + "=fail");
		}
		else
		{
			System.out.println("invalid marks");
			
		}
		// TODO Auto-generated method stub

	}

}
