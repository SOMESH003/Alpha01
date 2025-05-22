package Functions;

public class printPrimeInRange {
	public static boolean isPrime(int n) {
		if(n==2) {
			return true;
		}
		for(int i=2;i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void primeInRange(int n) {
		int count =0;
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\nTotal number of Prime below " + n + " : " + count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		primeInRange(n);

	}

}
