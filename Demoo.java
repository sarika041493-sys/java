package multithreading;
import java.util.Scanner;

class test1 extends Thread{
	public void run()
	{
		System.out.println("Addition task started");
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = s.nextInt();
		System.out.println("enter the second number");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println(sum);
		System.out.println("Addition task completed");
	}
}

class test2 extends Thread{
	public void run()
	{
		System.out.println("character printing started");
		for( int i = 65; i <= 75;i++)
		{
			System.out.println((char)i);
			try{
				Thread.sleep(5000);
			}catch(Exception e)
			{
				System.out.println("interrupted exception");
			}
		}
		// TODO Auto-generated method stub
System.out.println("character printing completed");

	}
}

class test3 extends Thread{
	public void run()
	{
		System.out.println("Number printing task started");
		for( int i =1; i <= 10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(5000);
			}catch(Exception e)
			{
				System.out.println("exception");
			}
		}
		System.out.println("number printed task cpmleted");
	}
}

public class Demoo{

	public static void main(String[] args) {
		test1 t1 = new test1();
		test2 t2 = new test2();
		test3 t3 = new test3();
		t1.start();
		t2.start();
		t3.start();
		// TODO Auto-generated method stub

	}

}
