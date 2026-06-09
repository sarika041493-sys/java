package multithreading;

import java.util.Scanner;

class Demo1{
	void fun1() throws Exception
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

class Demo2{
	void fun2()throws Exception
	{
		System.out.println("character printing started");
		for( int i = 65; i <= 75;i++)
		{
			System.out.println((char)i);
			Thread.sleep(5000);
		}
		// TODO Auto-generated method stub
System.out.println("character printing completed");
	}
}

class Demo3{
	void fun3() throws Exception
	{
		System.out.println("Number printing task started");
		for( int i =1; i <= 10; i++)
		{
			System.out.println(i);
			Thread.sleep(5000);
		}
		System.out.println("number printed task cpmleted");
	}
}

public class Demos {

	public static void main(String[] args) throws Exception {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d1.fun1();
		d2.fun2();
		d3.fun3();
		// TODO Auto-generated method stub

	}

}
