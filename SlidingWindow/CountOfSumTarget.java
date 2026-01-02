import java.util.*;
public class CountOfSumTarget{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements of the array: ");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Target Sum : ");
		int k = sc.nextInt();
		System.out.println("Count of Subarrays : " + getCount(arr, n, k));
	}
	public static int getCount(int arr[], int n, int k){
		//brute force
		int count = 0;
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = i; j < n; j++){
				sum += arr[j];
				if(sum == k) count++;
			}
		}
		return count;
	}
}