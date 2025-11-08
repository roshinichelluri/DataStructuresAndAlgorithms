public class isPerfectNumber{
	public static void main(String[] args){
		int a = 25;
		int b = 50;

		boolean res1 = isPerfect(a);
		boolean res2 = isPerfect(b);

		System.out.println(a+" "+res1);
		System.out.println(b+" "+res2);
	}
	public static Boolean isPerfect(int n){
		int i = 1;
		while(i * i <= n){
			if(i * i == n)
				return true;
			i++;
		}
		return false;
	}
}