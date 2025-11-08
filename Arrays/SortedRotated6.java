import java.util.*;
public class SortedRotated6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter Array Elements:");
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Min Element: "+getMinIndex(a, n));
	}
	public static int getMinIndex(int a[], int n){
		//Binary search
		int l = 0, h = n - 1;
		while(l <= h){
			if(a[l] <= a[h]) return a[l];
			int m = l + (h - l) / 2;
			if(a[l] <= a[m]) l = m + 1;
			else h = m;
		}
		return 0;
	}
}