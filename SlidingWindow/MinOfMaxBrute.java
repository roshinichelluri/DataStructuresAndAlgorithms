import java.util.*;
public class MinOfMaxBrute{
	public static void main(String[] args){
		int arr[] = {-1, -1, 2, 3, 4, 5, 5};
		int n = arr.length;
		int k = 3;
		System.out.print(getMinOfMax(arr, n, k));
	}
	public static int getMinOfMax(int arr[], int n, int k){
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i <= n - k; i++){
			int max = Integer.MIN_VALUE;
			for(int j = i; j < i + k; j++){
				if(arr[j] > max) max = arr[j];
			}
			ans = Math.min(ans, max);
		}
		return ans;
	}
}
