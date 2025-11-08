import java.util.*;
public class ThreeSum9{
	public static void main(String[] args){
		int arr[] = {0, 2, 6, 1, 3};
		int n = arr.length;
		int target = 10;
		int res = isTripletExists(arr, n, target);
		System.out.println(res);
	}
	public static int isTripletExists(int arr[], int n, int target){
		//Hashing with returning COUNT Of Triplets
		HashSet<Integer> hs = new HashSet<>();
		int count = 0;
		for(int num : arr) hs.add(num);
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				int sum = arr[i] + arr[j];
				if(hs.contains(target - sum)){
					count += 1;	
				}					
			}
		}						
		return count;
	}
}
		

