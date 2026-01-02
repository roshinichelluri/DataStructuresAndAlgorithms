import java.util.*;
public class MaxSumDistinctBrute{
	public static void main(String[] args){
		int arr[] = {4,2,4,5,6};
		int res = maxSumDistinct(arr,arr.length);
		System.out.print(res);
	}
	public static int maxSumDistinct(int arr[],int n){
		int maxSum = 0;
		for(int i = 0; i < n; i++){
			HashSet<Integer> set = new HashSet<>();
			int sum = 0;
			for(int j = i; j < n; j++){
				if(set.contains(arr[j])) break;
				set.add(arr[j]);
				sum += arr[j];
				if(sum > maxSum) maxSum = sum;
			}
		}
		return maxSum;
	}
}
