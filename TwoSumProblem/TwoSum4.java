import java.util.*;
public class TwoSum4{
	public static void main(String[] args){
		//24
		//Sorted array and return the indices
		int arr[] = {0, 1, 2, 3, 9};
		int target = 2;
		boolean res = isTwoSum(arr, target);
		System.out.println(res);
	}
	public static boolean isTwoSum(int[] arr, int target){
        	HashMap<Integer, Integer> map = new HashMap<>(); 
        	for(int i = 0; i < arr.length; i++){
            		int complement = target - arr[i];
            		if(map.containsKey(complement)){
                		return true;
            		}
            		map.put(arr[i], i);
       		}
        	return false;
	}
}