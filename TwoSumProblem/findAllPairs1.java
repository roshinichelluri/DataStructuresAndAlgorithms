import java.util.*;
public class findAllPairs1{
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
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				int sum = arr[i] + arr[j];
				if(sum == target){
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(arr[i]);
					temp.add(arr[j]);
					al.add(temp);
				}

			}
		} 
		return al;
	}
}