public class SortByParity{
	public static void main(String[] args){
		int arr[] = {3,2,4,9,6,11};
		int i = 0,j = arr.length-1;
		while(i < j){
			while(i < j && arr[i] % 2 == 0) i++;
			while(i < j && arr[j] % 2!=0) j--;
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		for(int n:arr) System.out.print(n+" ");
	}
}
