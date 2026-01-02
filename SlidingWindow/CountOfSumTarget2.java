import java.util.*;
public class CountOfSumTarget2{
	public static void main(String[] args){kjipo
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
		int count = 0;
		int l = 0, sum = 0;
		for(int r = 0; r < n; r++){
			sum += arr[r];
			while(sum > k && l < r){
				sum -= arr[l];
				l++;
			}
			if(sum == k) count++;
		}
		return count;
	}
}