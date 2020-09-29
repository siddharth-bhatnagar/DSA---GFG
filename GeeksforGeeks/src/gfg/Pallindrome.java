package gfg;

public class Pallindrome {
	
	public static void main(String[] args) {
		
		System.out.print(isPal(5454554));
		
	}
	
	static boolean isPal(int n) {
		int ld, temp, rev = 0;
		temp = n;
		while(temp != 0) {
			ld = temp % 10;
			rev = ld + rev * 10;
			temp = temp / 10;
		}
		return rev==n;
		
	}
	
}
