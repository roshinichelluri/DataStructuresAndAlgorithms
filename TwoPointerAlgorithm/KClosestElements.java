import java.util.*;
public class KClosestElements{
	public static void main(String[] args){

		/*Find K closest elements to a given value in an array
		You are given a sorted integer array of size n, you are also given k and 			target , now find k closest elements to the target in the array and the target 			may or may not exist in the array. if target is less than first element return 			first k elements, If target is > last element return last k elements 
		EX: [10, 12, 15, 17, 18, 20, 25] k = 4 and target = 16
			op : [12, 15, 17, 18]
  		  [2, 3, 4, 5, 6, 7], k = 3, target = 1 and output = [2, 3, 4]
    		[2, 3, 4, 5, 6, 7] k = 2, target = 8 and output = [6, 7] */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.println("Enter K value:");
		int k = sc.nextInt();
		System.out.println("Enter target value:");
		int target = sc.nextInt();
		getClosestK(arr, n, k, target);
	}
	public static void getClosestK(int arr[], int n, int k, int target){
		ArrayList<Integer> al = new ArrayList<>();
		if(target <= arr[0]){
			for(int val = 0; val < k; val++) al.add(arr[val]);
		}
		else if(target >= arr[n - 1]){
			for(int val = n - 1; val >= k; val--) al.add(arr[val]);
		}
		else{
			int l = 0, r = n - 1;
			while(r - l >= k){
				if(Math.abs(arr[l] - target) > Math.abs(arr[r] - target)) l++;
				else r--;
			}
			for(int i = l; i <= k; i++) al.add(arr[i]);
		}
		for(int i = 0; i < al.size(); i++) System.out.print(al.get(i) + " ");
	}
}
			
		

		