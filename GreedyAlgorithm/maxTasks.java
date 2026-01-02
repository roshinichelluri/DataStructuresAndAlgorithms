import java.util.*;
public class maxTasks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();	
		int t = sc.nextInt();
		int maxTasks = maxT(arr, n, t);
		System.out.print("Maximum no of tasks: " + maxTasks);
	}
	public static int maxT(int arr[], int n, int t){
		int count = 0, sum = 0;
		Arrays.sort(arr);
		for(int i = 0; i < n; i++){
			sum += arr[i];
			count++;
			if(sum > t) break;
		}
		return count - 1;
	}
}