public class gcdOfArray{
	public static void main(String[] args){
		int[] arr = {24, 48, 74, 98};
		int result = GCDOfArray(arr);
		System.out.println("GCD: "+result);
	}
	public static int GCDOfArray(int arr[]){

		int ans = gcd(arr[0],arr[1]);

		for(int i = 2; i < arr.length; i++)
			ans = gcd(ans , arr[i]);

		return ans;
	}
	public static int gcd(int a , int b){
		while(b != 0){
			int c = a % b;
			a = b;
			b = c;
		}
		return a;
	}
}