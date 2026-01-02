import java.util.*;
public class MinMaxPQ{
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
		PriorityQueue<int[]> minPQ = new PriorityQueue<>((a,b)->a[0]-b[0]);
		PriorityQueue<int[]> maxPQ = new PriorityQueue<>((a,b)->b[0]-a[0]);
		for(int i = 0; i < n; i++){
			minPQ.add(new int[]{arr[i], i});
			maxPQ.add(new int[]{arr[i], i});
			while(minPQ.peek()[1] <= i - k) minPQ.poll();
			while(maxPQ.peek()[1] <= i - k) maxPQ.poll();
			if(i >= k - 1)
				res[idx++] = maxPQ.peek()[0] - minPQ.peek()[0];
		}
		return res;
	}
}
