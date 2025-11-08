import java.util.*;
public class ThreeSum3{
	public static void main(String[] args){
		int arr[] = {0, 2, 6, 1, 3};
		int n = arr.length;
		int target = 23;
		boolean res = isTripletExists(arr, n, target);
		System.out.println(res);
	}
	public static boolean isTripletExists(int arr[], int n, int target){
		//Hashing with boolean return value
		HashSet<Integer> hs = new HashSet<>();
		for(int num : arr) hs.add(num);
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				int sum = arr[i] + arr[j];
				if(hs.contains(target - sum)) 
					return true;
			}
		}						
		return false;
	}
}
		

