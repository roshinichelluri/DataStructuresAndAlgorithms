import java.util.*;
public class NoOfDistinct{
	public static void main(String[] args){
		int arr[] = {-1, -1, 2, 3, 4, 5, 5};
		int n = arr.length;
		int k = 3;
		int res[] = getDistinct(arr, n, k);
		for(int x : res) System.out.print(x + " ");
	}
	public static int[] getDistinct(int arr[], int n, int k){
		int res[] = new int[n - k + 1];
		int idx = 0;
		for(int i = 0; i <= n - k; i++){
			HashMap<Integer, Integer> hm = new HashMap<>();
			for(int j = i; j < i + k; j++){
				hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);
			}
			res[idx++] = hm.size();
		}
		return res;
	}
}
