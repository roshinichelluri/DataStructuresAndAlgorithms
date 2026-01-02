import java.util.*;
public class NoOfDistinct2{
	public static void main(String[] args){
		int arr[] = {5, -3, -3, 4, 5, 6, 6};
		int n = arr.length;
		int k = 3;
		int res[] = getDistinct(arr, n, k);
		for(int x : res) System.out.print(x + " ");
	}
	public static int[] getDistinct(int arr[], int n, int k){
		int res[] = new int[n - k + 1];
		int idx = 1;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i = 0; i < k; i++){
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		res[0] = hm.size();
		for(int i = k; i < n; i++){
			int out = arr[i - k];
			hm.put(out, hm.getOrDefault(out, 0) - 1);
			if(hm.get(out) == 0) hm.remove(out);
			int in = arr[i];
			hm.put(in, hm.getOrDefault(in, 0) + 1);
			res[idx++] = hm.size();
		}
		return res;		
	}
}
