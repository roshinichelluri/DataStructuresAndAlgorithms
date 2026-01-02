import java.util.*;
public class MinMaxDQ{
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
		Deque<Integer> minDQ = new ArrayDeque<>();
		Deque<Integer> maxDQ = new ArrayDeque<>();
		for(int i = 0; i < n; i++){
			while(!minDQ.isEmpty() && minDQ.peekFirst() <= i - k)
				minDQ.pollFirst();
			while(!maxDQ.isEmpty() && maxDQ.peekFirst() <= i - k)
				maxDQ.pollFirst();
			while(!minDQ.isEmpty() && arr[minDQ.peekLast()] >= arr[i])
				minDQ.pollLast();
			while(!maxDQ.isEmpty() && arr[maxDQ.peekLast()] <= arr[i])
				maxDQ.pollLast();
			minDQ.addLast(i);
			maxDQ.addLast(i);
			if(i >= k - 1)
				res[idx++] = arr[maxDQ.peekFirst()] - arr[minDQ.peekFirst()];
		}
		return res;
	}
}
