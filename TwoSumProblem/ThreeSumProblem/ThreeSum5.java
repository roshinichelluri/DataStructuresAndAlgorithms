import java.util.*;
public class ThreeSum5{
	public static void main(String[] args){
		int arr[] = {0, 2, 6, 1, 3};
		int n = arr.length;
		int target = 23;
		ArrayList<ArrayList<Integer>> res = isTripletExists(arr, n, target);
		System.out.println(res);
	}
	public static ArrayList<ArrayList<Integer>> isTripletExists(int arr[], int n, int target){
		//Two pointer with returning 1 TRIPLET
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		boolean found = false;
		for(int i = 0; i < n && !found; i++){
			int l = 0;
			int r = n - 1;
			while(l < r){
				int sum = arr[i] + arr[l] + arr[r];
				if(sum == target) {
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(arr[i]);
					temp.add(arr[l]);
					temp.add(arr[r]);
					al.add(temp);
					found = true;
					break;
				}
				else if(sum < target) l++;
				else r--;
			}
		}				
		return al;
	}
}
		

