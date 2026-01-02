import java.util.*;
public class MaxMinBrute{
	public static void main(String[] args){
		int arr[] = {-1, -1, 2, 3, 4, 5, 5};
		int n = arr.length;
		int k = 3;
		int res[] = getDiff(arr, n, k);
		for(int x : res) System.out.print(x + " ");
	}
	public static int[] getDiff(int arr[], int n, int k){
		int res[] = new int[n - k + 1];
		int idx = 0;
		for(int i = 0; i <= n - k; i++){
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int j = i; j < i + k; j++){
				min = Math.min(min, arr[j]);
				max = Math.max(max, arr[j]);
			}
			res[idx++] = max - min;
		}
		return res;
	}
}
