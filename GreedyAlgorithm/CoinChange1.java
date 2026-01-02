import java.util.*;
public class CoinChange1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int arr[] = {1, 2, 5, 10, 20, 50, 100, 200, 500};
		int count = 0, sum = 0;
		for(int i = arr.length - 1; i >= 0; i--){
			while(v > arr[i]){
				v -= arr[i];
				count++;
			}
		}
		System.out.println("The no of notes / coins are: " + count);
	}
}