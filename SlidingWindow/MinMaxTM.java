import java.util.*;
public class MinMaxTM{
	public static void main(String[] args){
		int arr[] = {-1, -1, 5, 5};
		int n = arr.length;
		int k = 3;
		int res[] = getDiff(arr, n, k);
		for(int x : res) System.out.print(x + " ");
	}
	public static int[] getDiff(int arr[], int n, int k){
		int res[] = new int[n - k + 1];
		int idx = 0;
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		for(int i = 0; i < n; i++){
			tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);
			if(i >= k){
				tm.put(arr[i - k], tm.get(arr[i - k]) - 1);
				if(tm.get(arr[i - k]) == 0) tm.remove(arr[i - k]);
			}
			if(i >= k - 1)
				res[idx++] = tm.lastKey() - tm.firstKey();
		}
		return res;
	}
}
