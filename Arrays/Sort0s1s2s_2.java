public class Sort0s1s2s_2{
	public static void main(String[] args){
		int[] arr={0,1,2,0,1,2,1,1,0,2};
		int l = 0,m = 0,h = arr.length-1;
		while(m <= h){
			if(arr[m] == 0){
				int t = arr[l];
				arr[l] = arr[m];
				arr[m] = t;
				l++;
				m++;
			}
			else if(arr[m]==1){
				m++;
			}
			else{
				int t = arr[m];
				arr[m] = arr[h];
				arr[h] = t;
				h--;
			}
		}
		for(int n:arr) System.out.print(n+" ");
	}
}
