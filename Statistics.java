package lab5;

public class Statistics {

	public static void main(String[] args) {
		 int[] numbers = {5,3,8,1,9};
		 int min = numbers[0];
		 int max = numbers[0];
		 int sum = 0;
		 
		 // to calculate min, max, sum
		 for(int i=0; i< numbers.length; i++)
		 {
			if(numbers[i] < min)
			{
				min = numbers[i];
			}
		 
			if(numbers[i] > max)
			{
				max = numbers[i];
			}
			sum += numbers[i];
		 }
		 
		 double mean = (double)sum/numbers.length;
		 
		 // sort 
		 for(int i =0; i<numbers.length-1; i++)
		 {
			 for(int j=0; j < numbers.length - i -1; j++)
			 {
				 if(numbers[j] > numbers[j+1])
				 {
					 int temp = numbers[j];
					 numbers[j] = numbers[j+1];
					 numbers[j+1]= temp;
					 
				 }
			 }
		 }
		 
		 // median
		 double median;
		 int n = numbers.length;
		 
		 if(n%2 == 0)
		 {
			 median = (numbers[n/2 -1]+ numbers[n/2])/2.0;
			 
		 }
		 else
		 {
			 median = numbers[n/2];
		 }
		 
		 System.out.println("Min= "+min);
		 System.out.println("Max= "+max);
		 System.out.println("Mean= "+mean);
		 System.out.println("Median= "+median);
		// TODO Auto-generated method stub

	}

}
