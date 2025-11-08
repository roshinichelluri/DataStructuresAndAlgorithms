import java.util.*;
public class SentinelSearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value & Array Elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.println("Enter Target:");
		int target = sc.nextInt();
		int i = 0;
		int last = arr[n - 1];
		arr[n - 1] = target;
		while(arr[i] != target) i++;
		if(i != n - 1) System.out.println("Index of " + target + " is " + i);
		else if(last == target) System.out.println("Index of " + target + " is " + (n - 1));
		else System.out.println("Element not found");
	}
}