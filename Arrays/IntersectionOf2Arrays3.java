import java.util.Arrays;
import java.util.*;
public class IntersectionOf2Arrays3{
	public static void main(String[] args){
		//Sorting and BinarySearch
		ArrayList<Integer> al = new ArrayList<>();
		int a[] = {8, 9, 3, 0, 1, 90};
		int b[] = {10, 8, 9, 89, 1, 20, 90};
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0; i < a.length; i++){
			int l = 0, h = b.length - 1;
			while(l <= h){
				int m = l + (h - l) / 2;
				if(b[m] == a[i]){
					al.add(a[i]);
					break; 
				} 
				else if(a[i] < b[m]) h = m - 1;
				else l = m + 1;
			} 
		}
		for(int num : al) System.out.print(num + " ");
	}
}