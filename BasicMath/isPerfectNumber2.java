public class isPerfectNumber2{
	public static void main(String[] args){
		int a = 16;
		int b = 23;

		String res1 = isPerfect(a);
		String res2 = isPerfect(b);

		System.out.println(a+" "+res1);
		System.out.println(b+" "+res2);
	}
	public static String isPerfect(int n){
		int x = (int) Math.sqrt(n);

		if(x * x == n)
			return "is a Perfect Number";

		return "is not a Perfect Number";
		
	}
}