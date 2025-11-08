import java.util.*;
import java.util.Arrays;
public class findAllPairs3_3{
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

		int res = findAllPairs(arr, n, target);

		System.out.println("No.of Pairs with target Sum are: " + res);
		
	}
	public static int findAllPairs(int arr[], int n, int target){
		//count all the pairs - hashmap
		//unsorted and distinct data
		int count = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int num : arr) hm.put(num,1);
		for(int num : arr){
			int x = target - num;
			if(hm.containsKey(x)){
				count += 1;
			}
			hm.put(x, hm.getOrDefault(x, 0) + 1);
		}
		return count;
	}
}