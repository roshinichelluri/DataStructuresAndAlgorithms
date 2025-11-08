import java.util.Arrays;
public class TwoSum2{
	public static void main(String[] args){
		//22
		//Sorted array and return boolean element
		int arr[] = {1, 2, 5};
		int target = 5;
		boolean res = isTwoSum(arr, target);
		System.out.println(res);
	}
	public static boolean isTwoSum(int[] arr, int target){
		int i = 0;
		int j = arr.length - 1;
		while(i < j){
			int sum = arr[i] + arr[j];
			if(sum == target){
				return true;
			}
			else if(sum < target) i++;
			else j--;
		}
		return false;
	}
}