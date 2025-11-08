import java.util.Arrays;
public class BinarySearch5{
	public static void main(String[] args){
		int arr[] = {23, 57, 12, 90, 44, 78};
		int target = 100;
		Arrays.sort(arr);
		int n = arr.length;
		System.out.println(binarySearch(arr, n, target, 0, n - 1));
	}
	public static boolean binarySearch(int a[], int n, int x, int l, int h){
		if(l > h) return false;
		else{
			int m = l + (h - l) / 2;
			if(a[m] == x) return true;
			else if(x < a[m])
				return binarySearch(a, n, x, l, m-1);
			else return binarySearch(a, n, x, m + 1, h);
		}	
	}
}