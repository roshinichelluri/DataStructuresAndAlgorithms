public class BinarySearch3{
	public static void main(String[] args){
		int arr[] = {3, 4, 8, 8, 8, 8, 8, 10};
		int target = 8;
		int first = getFirstOccurance(arr, arr.length, target);
		int last = getLastOccurance(arr, arr.length, target);
		System.out.println(last - first + 1);
	}
	public static int getLastOccurance(int arr[], int n, int x){
		int l = 0;
		int h = n - 1;
		int idx = -1;
		while(l <= h){
			int m = l + (h - l) / 2;
			if(arr[m] == x){
				idx = m;
				l = m + 1;
			}
			else if(x < arr[m]) h = m - 1;
			else l = m + 1;
		}
		return idx;
	}
	public static int getFirstOccurance(int arr[], int n, int x){
		int l = 0;
		int h = n - 1;
		int idx = -1;
		while(l <= h){
			int m = l + (h - l) / 2;
			if(arr[m] == x){
				idx = m;
				h = m - 1;
			}
			else if(x < arr[m]) h = m - 1;
			else l = m + 1;
		}
		return idx;
	}
}
//You are given n integers ( sorted and duplicate) also target x , find 
//freq of x in sorted array using binary search