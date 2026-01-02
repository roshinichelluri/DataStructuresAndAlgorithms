import java.util.*;
public class MaxinEachSubarray{
	public static void main(String[] args){
		int arr[] = {-1, -1, 2, 3, 4, 5, 5};
		int n = arr.length;
		int k = 3;
		int res[] = getMax(arr, n, k);
		for(int x : res) System.out.print(x + " ");
	}
	public static int[] getMax(int arr[], int n, int k){
		int res[] = new int[n - k + 1];
		int idx = 0;
		PriorityQueue<int[]> pq = new PriorityQueue<>(
			(a, b) -> b[0] - a[0]
		);
		for(int i = 0; i < n; i++){
			pq.add(new int[]{arr[i], i});
			while(pq.peek()[1] <= i - k)
				pq.poll();
			if(i >= k - 1)
				res[idx++] = pq.peek()[0];
		}
		return res;
	}
}
