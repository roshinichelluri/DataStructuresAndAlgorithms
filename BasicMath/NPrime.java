import java.util.Arrays;

public class NPrime {
	public static void main(String[] args){
		int n = 35;
		findPrimes(n);
	}
	static void findPrimes(int n){
		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;

		for (int i = 2; i*i <= n; i++){
			if (arr[i] == true){
				for(int j = i * i; j <= n; j += i){
					arr[j] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++){
			if (arr[i]) System.out.println(i);
		}
	}
}
