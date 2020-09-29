package gfg;

public class CountingDigits {

	public static void main(String[] args) {
		System.out.println(countDigits(1000));
		System.out.println(countDigitsRecursion(1000));
		System.out.println(countLogarithmic(1000));
	}

	static int countDigits(long n) {

		// iterative approach

		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;

	}
	
	static int countDigitsRecursion(long n) {
		
		// recursive approach
		if(n == 0)
			return 0;
		return 1 + countDigitsRecursion(n/10);
		
	}
	
	static int countLogarithmic(long n) {
		return (int)Math.floor(Math.log10(n) + 1);
	}

}
