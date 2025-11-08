import java.util.*;
public class IntersectionOf2Arrays{
	public static void main(String[] args){
		//Brute Force
		ArrayList<Integer> al = new ArrayList<>();
		int a[] = {8, 9, 3, 0, 1};
		int b[] = {10, 8, 9, 89, 1, 20};
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b.length; j++){
				if(a[i] == b[j]) al.add(a[i]);
			}
		}
		for(int num : al) System.out.println(num);
	}
}