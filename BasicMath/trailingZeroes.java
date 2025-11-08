public class trailingZeroes{
	public static void main(String[] args){
		int n = 12;
		int res = trailingZeroes(n);
		System.out.println(n+" has "+res+" trailing zeroes");
	}
	public static int trailingZeroes(int n){
		int c = 0;
		long fact = fact(n);

		while(fact % 10 == 0){
			c++;
			fact = fact / 10;
		}
		return c;
	}
	public static long fact(int n){
		long fact = 1;
		for(int i = 1; i <= n; i++) fact = fact * i;
		return fact;
	}
}