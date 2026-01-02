import java.util.*;
public class MaxinEachSubarray3{
	public static void main(String[] args){
		int arr[] = {-1, -1, 5, 5};
		int n = arr.length;
		int k = 2;
		int res[] = getMin(arr, n, k);
		for(int x : res) System.out.print(x + " ");
	}
	public static int[] getMin(int arr[], int n, int k){
		int res[] = new int[n - k + 1];
		int idx = 0;
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		for(int i = 0; i < n; i++){
			tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);
			if(i >= k){
				int out = arr[i - k];
				tm.put(out, tm.get(out) - 1);
				if(tm.get(out) == 0) tm.remove(out);
			}
			if(i >= k - 1)
				res[idx++] = tm.firstKey();
		}
		return res;
	}
}
