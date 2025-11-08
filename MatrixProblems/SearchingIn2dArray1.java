import java.util.*;
public class SearchingIn2dArray1{
	public static void main(String[] args){
		//SEARCH IN SORTED 2D ARRAY (MATRIX)
		//you are given a sorted 2d array of size n * n, The array is sorted row wise and column wise, we are also given a target element, now search 		//the element in //2d array and return it's co-ordinated positions

		//Ex : {{2, 8, 12, 16}, {7, 14, 19, 25}, {15, 22, 34, 38}, {19, 35, 42, 49}} and the target is 12 the output is [0, 2]
		//We can solve this problem in following 3 ways, 1) Brute-force O(n^2) 2) Binary Search O(nlogn) 3) Optimised binary Search O(nlogn)

		int[][] mat = {{2, 8, 12, 16}, {7, 14, 19, 25}, {15, 22, 34, 38}, {19, 35, 42, 49}};
		boolean found = false;
		int n = mat.length;
		int target = 34;
		//int target = 100;
		for(int i = 0; i < n; i++){
			int p = bSearch(mat[i], n, target);
			if(p != -1){
				System.out.println("The index of Target Element is : " + i + "," + p);
				found = true;
				break;
			}
		}
		if(!found) System.out.println("The element doesn't exist in the matrix");
	}
	public static int bSearch(int arr[], int n, int x){
		int l = 0, h = n - 1; 
		while(l <= h){
			int m = l + (h - l) / 2;
			if(arr[m] == x) return m;
			else if(x < arr[m]) h = m - 1;
			else l = m + 1;
		}
		return -1;
	}
}

