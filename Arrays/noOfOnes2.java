import java.util.*;
public class noOfOnes2{
	public static void main(String[] args){
		//You are given sorted binary array in descending order find no of ones
		int arr[] = {1, 1, 1, 0, 0};
		int n = arr.length;
		int l = 0, h = n - 1;
		int lastOcc = -1;
		while(l <= h){
			int m = l + (h - l) / 2;
			if(arr[m] == 1){
				l = m + 1;
				lastOcc = m;
			}
			else if(1 < arr[m]) h = m - 1;
			else l = m + 1;
		}
		System.out.println("No of Ones: " + (lastOcc+1));
	}
}