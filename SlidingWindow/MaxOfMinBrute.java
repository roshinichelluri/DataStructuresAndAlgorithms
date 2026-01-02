import java.util.*;
public class MaxOfMinBrute{
	public static void main(String[] args){
		int arr[] = {-1, -1, 2, 3, 4, 5, 5};
		int n = arr.length;
		int k = 3;
		System.out.print(getMaxOfMin(arr, n, k));
	}
	public static int getMaxOfMin(int arr[], int n, int k){
		int ans = Integer.MIN_VALUE;
		for(int i = 0; i <= n - k; i++){
			int min = Integer.MAX_VALUE;
			for(int j = i; j < i + k; j++){
				if(arr[j] < min) min = arr[j];
			}
			ans = Math.max(ans, min);
		}
		return ans;
	}
}
