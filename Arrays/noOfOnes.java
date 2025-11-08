import java.util.*;
public class noOfOnes{
	public static void main(String[] args){
		/*count no of 1s in sorted binary array
		you are given a sorted binary array in increasing order, now find no of ones 
		Ex : [0 0 0 0 1 1 1] op = 3, [0 0 0 0] op = 0, [1 1 1 1 1] op = 5
		solve using O(n) and O(logn)*/

		int arr[] = {0, 0, 0, 1, 1, 1};
		int n = arr.length;
		int l = 0, h = n - 1;
		int firstOcc = -1;
		while(l <= h){
			int m = l + (h - l) / 2;
			if(arr[m] == 1){
				h = m - 1;
				firstOcc = m;
			}
			else if(1 < arr[m]) h = m - 1;
			else l = m + 1;
		}
		System.out.println("No of Ones: " + (n - firstOcc));
	}
}
		