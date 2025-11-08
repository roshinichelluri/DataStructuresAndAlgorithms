public class isPerfectNumber4{
	public static void main(String[] args){
		int a = 90;
		int b = 225;

		boolean res1 = isPerfect(a);
		boolean res2 = isPerfect(b);

		System.out.println(a+" "+res1);
		System.out.println(b+" "+res2);
	}
	public static Boolean isPerfect(int n){
		int low = 1, high = n;
		
		while(low <= high){
			int mid = (low + high) / 2;
			
			if(mid * mid == n)
				return true;
			else if(mid * mid < n)
				low = mid + 1;
			else 
				high = mid - 1;
		}

		return false;	
	}
}