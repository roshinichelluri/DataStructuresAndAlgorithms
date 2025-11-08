public class ThreeSum2{
	public static void main(String[] args){
		int arr[] = {0, 2, 6, 1, 3};
		int n = arr.length;
		int target = 10;
		boolean res = isTripletExists(arr, n, target);
		System.out.println(res);
	}
	public static boolean isTripletExists(int arr[], int n, int target){
		//Two pointer with boolean return value
		for(int i = 0; i < n; i++){
			int l = 0;
			int r = n - 1;
			while(l < r){
				int sum = arr[i] + arr[l] + arr[r];
				if(sum == target) return true;
				else if(sum < target) l++;
				else r--;
			}
		}				
		return false;
	}
}
		

