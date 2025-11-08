public class ThreeSum1{
	public static void main(String[] args){
		int arr[] = {6, 1, 9, 3, 2, 8, 7, 5};
		int n = arr.length;
		int target = 13;
		boolean res = isTripletExists(arr, n, target);
		System.out.println(res);
	}
	public static boolean isTripletExists(int arr[], int n, int target){
		//Brute Force with boolean return value
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				for(int k = j + 1; k < n; k++){
					int sum = arr[i] + arr[j] + arr[k];
					if(sum == target) return true;
				}
			}
		}
		return false;
	}
}
		

