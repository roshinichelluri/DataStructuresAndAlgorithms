import java.util.*;
public class findAllPairs4_1{
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
		//counting all the pairs - brute force
		//sorted and distinct data
		int count = 0;
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				int sum = arr[i] + arr[j];
				if(sum == target){
					count += 1;
				}

			}
		} 
		return count;
	}
}