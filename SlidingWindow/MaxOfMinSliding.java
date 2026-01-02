import java.util.*;
public class MaxOfMinSliding{
	public static void main(String[] args){
		int arr[] = {-1, -1, 2, 3, 4, 5, 5};
		int n = arr.length;
		int k = 3;
		System.out.print(getMaxOfMin(arr, n, k));
	}
	public static int getMaxOfMin(int arr[], int n, int k){
		Deque<Integer> dq = new ArrayDeque<>();
		int ans = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			while(!dq.isEmpty() && dq.peekFirst() <= i - k)
				dq.pollFirst();
			while(!dq.isEmpty() && arr[dq.peekLast()] >= arr[i])
				dq.pollLast();
			dq.addLast(i);
			if(i >= k - 1)
				ans = Math.max(ans, arr[dq.peekFirst()]);
		}
		return ans;
	}
}
