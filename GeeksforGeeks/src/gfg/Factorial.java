package gfg;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factIter(5));
		System.out.println(factRecursion(6));

	}
	
	
	// iterative method -- time complexity is theta(n) and auxillary space is theta(1)
	
	public static long factIter(int n) {
		int res = 1;
		if (n == 1 || n == 0)
			return 1;
		for(int i = 2; i <= n; i++) {
			res = res * i;
		}
		return res;
	}
	
	public static long factRecursion(int n) {
		
		if (n==0)
			return 1;
		return n * factRecursion(n-1);
	}

}
