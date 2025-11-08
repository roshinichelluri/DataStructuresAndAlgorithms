public class LinearSearch1{
	public static void main(String[] args){
		int arr[] = {3, 99, 5, 78, 98, 33, 12};
		int target = 33;
		System.out.println(linearSearch(arr, arr.length, target));
	}
	public static int linearSearch(int a[], int n, int x){
		for(int i = 0; i < n; i++){
			if(a[i] == x) return i;
		}
		return -1;
	}
}
		