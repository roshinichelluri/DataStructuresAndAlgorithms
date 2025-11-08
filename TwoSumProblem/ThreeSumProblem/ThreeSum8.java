import java.util.*;
public class ThreeSum8{
	public static void main(String[] args){
		int arr[] = {0, 2, 6, 1, 3};
		int n = arr.length;
		int target = 23;
		int res = isTripletExists(arr, n, target);
		System.out.println(res);
	}
	public static int isTripletExists(int arr[], int n, int target){
		//Two pointer with returning COUNT of Triplets
		int count = 0;
		for(int i = 0; i < n; i++){
			int l = 0;
			int r = n - 1;
			while(l < r){
				int sum = arr[i] + arr[l] + arr[r];
				if(sum == target) {
					count += 1;
				}
				else if(sum < target) l++;
				else r--;
			}
		}				
		return count;
	}
}
		

