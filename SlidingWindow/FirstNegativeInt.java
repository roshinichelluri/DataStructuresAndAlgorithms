public class FirstNegativeInt{
	public static void main(String[] args){
		int arr[] = {8, -3, -1, 6, -2, 7, 8, -4};
		int k = 3;
		int res[] = getFirstIntegers(arr, k, arr.length);
		for(int x : res) System.out.print(x + " ");
	}
	public static int[] getFirstIntegers(int arr[], int k, int n){
		int res[] = new int[n - k + 1];
		int idx = 0;
		for(int i = 0; i <= n - k; i++){
			int x = 0;
			for(int j = i; j < i + k; j++){
				if(arr[j] < 0){
					x = arr[j];
					break;
				}
			}
			res[idx++] = x;
		}
		return res;
	}
}
