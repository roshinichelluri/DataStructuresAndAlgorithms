import java.util.*;
public class FirstNegativeInt2{
	public static void main(String[] args){
		int arr[] = {8, -3, -1, 6, -2, 7, 8};
		int k = 3;
		int res[] = getFirstIntegers(arr, k, arr.length);
		for(int x : res) System.out.print(x + " ");
	}
	public static int[] getFirstIntegers(int arr[], int k, int n){
		int res[] = new int[n - k + 1];
		Deque<Integer> dq = new ArrayDeque<>();
		int idx = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] < 0) dq.addLast(i);
			if(!dq.isEmpty() && dq.peekFirst() <= i - k) dq.removeFirst();
			if(i >= k - 1){
				if(dq.isEmpty()) res[idx++] = 0;
				else res[idx++] = arr[dq.peekFirst()];
			}
		}
		return res;
	}
}
