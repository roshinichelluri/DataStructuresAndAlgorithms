import java.util.*;
import java.util.Arrays;
public class findAllPairs2_3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of the Array");
		int n = sc.nextInt();
		System.out.println("Enter the Elements");
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter TARGET SUM value");
		int target = sc.nextInt();

		List<List<Integer>> res = new ArrayList<>();
		res = findAllPairs(arr, n, target);

		System.out.println("Pairs with target Sum are: ");
		for(List<Integer> pair : res) 
			System.out.println(pair);
		
	}
	public static List<List<Integer>> findAllPairs(int arr[], int n, int target){
		List<List<Integer>> al = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int num : arr) hm.put(num,1);
		for(int num : arr){
			int x = target - num;
			if(hm.containsKey(x)){
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(num);
				temp.add(x);
				al.add(temp);
			}
			hm.put(x, hm.getOrDefault(x, 0) + 1);
		}
		return al;
	}
}