public class LinearSearch2{
	public static void main(String[] args){
		int arr[] = {24, 56, 12, 90, 11};
		int target = 10;
		System.out.println(linearSearch(arr, arr.length, target, 0));
	}
	public static int linearSearch(int a[], int n, int x, int i){
		if(i >= n) return -1;
		else{
			if(a[i] == x) return i;
			return linearSearch(a, n, x, i+1);
		}
	}
}