package lab5;

public class PrimeDemo { // create primeDemo class
	static boolean isprime(int n){
		if(n<2) {
			return false;
		}
		for(int i=2; i<n; i++) {
			if(n%i == 0)
			{
				return false;
			}
		}return true;
	}
	
	static void primeInRange(int start, int end) { // primeInrange method creation
		for(int i= start; i<=end; i++) {
			if(isprime(i))
				System.out.print(i + " ");
			}System.out.println();
	}
	
	static void primeFactorization(int n) { // primeFactorization method creation
		for(int i=2; i<=n; i++) {
			while(n%i ==0) {
				System.out.print(i+ " ");
				n/=i;
			}
		}
		System.out.println();
	}

	public static void main(String[] args) { // main method
		System.out.println("isprime(17):" +isprime(17));
		System.out.println("isprime(4):" +isprime(4));
		
		System.out.print("Primes between 1 and 20: ");
		primeInRange(1,20);
		
		System.out.print("prime factors of 12: ");
		primeFactorization(12);
		
		System.out.print("prime factors of 100: ");
		primeFactorization(100);
		
		
		// TODO Auto-generated method stub

	}

}
