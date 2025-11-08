import java.util.*;
public class ThreeSum6{
	public static void main(String[] args){
		int arr[] = {0, 2, 6, 1, 3};
		int n = arr.length;
		int target = 10;
		ArrayList<ArrayList<Integer>> res = isTripletExists(arr, n, target);
		for(ArrayList<Integer> triplet : res){
			System.out.println(triplet);
		}
	}
	public static ArrayList<ArrayList<Integer>> isTripletExists(int arr[], int n, int target){
		//Hashing with returning 1 TRIPLET
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		boolean found = false;
		for(int num : arr) hs.add(num);
		for(int i = 0; i < n && !found; i++){
			for(int j = i + 1; j < n && !found; j++){
				int sum = arr[i] + arr[j];
				if(hs.contains(target - sum)){
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(arr[i]);
					temp.add(arr[j]);
					temp.add(target - sum);
					al.add(temp);
					found = true;
					break;	
				}					
			}
		}						
		return al;
	}
}
		

