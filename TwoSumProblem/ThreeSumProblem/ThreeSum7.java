import java.util.*;
public class ThreeSum7{
	public static void main(String[] args){
		int arr[] = {6, 1, 9, 3, 2, 8, 7, 5};
		int n = arr.length;
		int target = 13;
		int res = isTripletExists(arr, n, target);
		System.out.println(res);
	}
	public static int isTripletExists(int arr[], int n, int target){
		//Brute Force with returning COUNT of Triplets
		int count = 0;
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				for(int k = j + 1; k < n; k++){
					int sum = arr[i] + arr[j] + arr[k];
					if(sum == target){
						count += 1;
					}
				}
			}
		}
		return count;
	}
}
		

