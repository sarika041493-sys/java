package day4;

public class Matrimony {

	public static void main(String[] args) {
		String gender = "male";
		int age = 32;
	
		System.out.println("select your gender: " +gender   );
		if(gender == "male" )
		{
			
			System.out.println("enter your age" +age);
			if(age >=21) {
				System.out.println("yes, u can find your match");
				
			}
			else
			{
				System.out.println("no,u cant find, need to wait");
			}
		}
			else if(gender == "female")
			{
				System.out.println("selected gender" +gender);
			    System.out.println("enter your age" +age);
				if(age >18)
				{
					System.out.println("yes find ur match");
				}
				else
				{
					System.out.println("no,wait");
				}
			
		    }
		
		else
		{
			System.out.println("invalid");
		}
			
			
		
		
		
		
				
		// TODO Auto-generated method stub

	}

}
