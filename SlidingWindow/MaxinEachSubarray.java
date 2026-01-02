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
		//min element
		int res[] = new int[n - k + 1];
		int idx = 0;
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i = 0; i < n; i++){
			while(!dq.isEmpty() && dq.peekFirst() <= i - k)
				dq.pollFirst();
			while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
				dq.pollLast();
			dq.addLast(i);
			if(i >= k - 1)
				res[idx++] = arr[dq.peekFirst()];
		}
		return res;
	}
}
