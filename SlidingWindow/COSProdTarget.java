import java.util.*;
public class COSProdTarget{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int target = sc.nextInt();
		System.out.print("Count of Subarrays: " + getCount(arr, n, target));
	}
	public static int getCount(int arr[], int n, int target){
		int count = 0;
		for(int i = 0; i < n; i++){
			int prod = 1;
			for(int j = i; j < n; j++){
				prod *= arr[j];
				if(prod < target)
					count++;
				else
					break;
			}
		}
		return count;
	}
}
