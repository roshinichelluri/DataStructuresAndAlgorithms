import java.util.*;
public class MaxSumDistinctSliding{
	public static void main(String[] args){
		int arr[] = {4,2,5};
		int res = maxSumDistinct(arr,arr.length);
		System.out.print(res);
	}
	public static int maxSumDistinct(int arr[],int n){
		HashSet<Integer> set = new HashSet<>();
		int l = 0,sum = 0,max = 0;
		for(int r = 0; r < n; r++){
			while(set.contains(arr[r])){
				set.remove(arr[l]);
				sum -= arr[l];
				l++;
			}
			set.add(arr[r]);
			sum += arr[r];
			if(sum > max) max = sum;
		}
		return max;
	}
}
