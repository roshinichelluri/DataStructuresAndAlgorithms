import java.util.Arrays;
public class TernarySearch{
	public static void main(String[] args){
		int arr[] = {12, 55, 3, 48, 90, 2};
		int target = 2;
		Arrays.sort(arr);
		int n = arr.length;
		System.out.println(ternarySearch(arr, n, target));
	}
	public static int ternarySearch(int a[], int n, int x){
		int l = 0; 
		int h = n - 1;
		while(l <= h){
			int m1 = l + (h - l) / 3;
			int m2 = h - (h - l) / 3;
			if(a[m1] == x) return m1;
			else if(a[m2] == x) return m2;
			else if(x < a[m1]) h = m1 - 1;
			else if(x > a[m2]) l = m2 + 1;
			else{
				h = m1 - 1;
				l = m2 + 1;
			}
		}
		return -1;
	}
}