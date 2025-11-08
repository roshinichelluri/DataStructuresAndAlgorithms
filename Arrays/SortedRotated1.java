import java.util.*;
public class SortedRotated1{
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
		//Linear Search
		for(int i = 0; i < n; i++){
			if(a[i] == t) return i; 
		}
		return -1;
	}
}
