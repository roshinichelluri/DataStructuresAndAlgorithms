import java.util.*;
public class SortedRotated2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter Array Elements:");
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Target :");
		int t = sc.nextInt();
		System.out.println(getIndex(a, n, t));
	}
	public static int getIndex(int a[], int n, int t){
		//binary search
		int l = 0;
		int h = n - 1;
		while(l <= h){
			int m = l + (h - l) / 2;
			if(a[m] == t) return m;
			else if(a[l] < a[m]){
				if(t >= a[l] && t < a[m]) h = m - 1;
				else l = m + 1;
			}
			else{
				if(t > a[m] && t <= a[h]) l = m + 1;
				else h = m - 1;
			}
		}
		return - 1;
	}
}