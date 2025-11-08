import java.util.Arrays;
public class BinarySearch4{
	public static void main(String[] args){
		int arr[] = {23, 57, 12, 90, 44, 78};
		int target = 57;
		Arrays.sort(arr);
		System.out.println(binarySearch(arr, arr.length, target));
	}
	public static int binarySearch(int a[], int n, int x){
		int l = 0;
		int h = n - 1;
		while(l <= h){
			int m = l + (h - l) / 2;
			if(a[m] == x) return m;
			else if(x < a[m]) h = m - 1;
			else l = m + 1;
		}
		return -1;
	}
}