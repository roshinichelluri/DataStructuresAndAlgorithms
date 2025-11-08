import java.util.Arrays;
public class TwoSum1{
	public static void main(String[] args){
		//21
		//Sorted array and return boolean element
		int arr[] = {1,2,4,7,9};
		int target = 6;
		boolean res = isTwoSum(arr, target);
		System.out.println(res);
	}
	public static boolean isTwoSum(int[] arr, int target){
		int one = -1, two = -1;
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] + arr[j] == target){
					return true;
				}
			}
		}
		return false;
	}
}