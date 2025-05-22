package Functions;

public class BinomialCoefficent {
	
	public static int binomialCoeff(int n, int r) {
		int binoCoeff = factorial(n)/(factorial(r)*factorial(n-r));
		return binoCoeff;
	}
	
	public static int factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nCr = n!/(r! * (n-r)!)
		int n = 5;
		int r = 2;
		int bc = binomialCoeff(n,r);
		System.out.println(n+"C"+r + " = " + binomialCoeff(n,r));
	}

}
