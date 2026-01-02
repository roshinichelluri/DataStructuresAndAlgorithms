import java.util.*;
public class minOperationsSinglearr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int count = minOp(arr, n);
		System.out.print("No of Min Operations : " + count);
	}
	public static int minOp(int[] arr, int n){
		Arrays.sort(arr);
		int count = 0;
		int mid = arr[n / 2];
		for(int i = 0; i < n; i++){
			count += Math.abs(arr[i] - mid);
		}
		return count;
	}
}