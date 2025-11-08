import java.util.*;
public class SortedRotated5{
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
		//Linear search
		for(int i = 0; i < n - 1; i++){
			if(a[i + 1] < a[i]) return a[i + 1];
		}
		return -1;
	}
}