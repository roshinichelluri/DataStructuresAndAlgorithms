public class isPerfectNumber3{
	public static void main(String[] args){
		int a = 34;
		int b = 49;

		String res1 = isPerfect(a);
		String res2 = isPerfect(b);

		System.out.println(a+" "+res1);
		System.out.println(b+" "+res2);
	}
	public static String isPerfect(int n){
		double x = Math.sqrt(n);

		if(Math.floor(x) == Math.ceil(x))
			return "Is a Perfect Number";

		return "is not a Perfect Number";		
	}
}