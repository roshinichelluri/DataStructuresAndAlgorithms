import java.util.*;
public class HighestProduct{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int highestProd = highP(arr, n);
		System.out.print("Highest Product: " + highestProd);
	}
	public static int highP(int[] arr, int n){
		Arrays.sort(arr);
		int prod1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
		int prod2 = arr[n - 1] * arr[0] * arr[1];
		return prod2 > prod1 ? prod2 : prod1;
	}
}
