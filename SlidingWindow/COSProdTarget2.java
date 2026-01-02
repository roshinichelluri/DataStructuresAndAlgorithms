import java.util.*;
public class COSProdTarget2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int target = sc.nextInt();
		System.out.print("Count of Subarrays: " + getCount(arr, n, target));
	}
	public static int getCount(int arr[], int n, int target){
		int l = 0;
		int prod = 1;
		int count = 0;
		for(int r = 0; r < n; r++){
			prod *= arr[r];
			while(prod >= target && l < r){
				prod /= arr[l];
				l++;
			}
			if(prod < target) count += (r - l + 1);
		}
		return count;
	}
}
			