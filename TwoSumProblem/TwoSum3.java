import java.util.Arrays;
public class TwoSum3{
    public static void main(String[] args){
	//23
	//Sorted array and return boolean element
        int arr[] = {0, 1, 2, 3, 4, 5, 9};
        int target = 8;
        boolean res = isTwoSum(arr, target);
        System.out.println(res);
    }

    public static boolean isTwoSum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            int p = binarySearch(arr, complement);
            if (p != -1 && p != i){
                return true;
            }
        }
        return false;
    }

    public static int binarySearch(int arr[], int x){
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){
            int m = (l + r) / 2;
            if (arr[m] == x) return m;
            else if (x < arr[m]) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }
}
