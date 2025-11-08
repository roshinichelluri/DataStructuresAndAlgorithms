import java.util.*;
public class ThreeSum4{
	public static void main(String[] args){
		int arr[] = {6, 1, 9, 3, 2, 8, 7, 5};
		int n = arr.length;
		int target = 13;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		res = isTripletExists(arr, n, target);
		for(ArrayList<Integer> triplet : res){
			System.out.println(triplet);
		}
	}
	public static ArrayList<ArrayList<Integer>> isTripletExists(int arr[], int n, int target){
		//Brute Force with returning 1 TRIPLETS
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		boolean found = false;
		for(int i = 0; i < n && !found; i++){
			for(int j = i + 1; j < n && !found; j++){
				for(int k = j + 1; k < n; k++){
					int sum = arr[i] + arr[j] + arr[k];
					if(sum == target){
						ArrayList<Integer> temp = new ArrayList<>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						al.add(temp);
						found = true;
						break;
					}
				}
			}
		}
		return al;
	}
}
		

