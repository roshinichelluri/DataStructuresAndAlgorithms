import java.util.*;
public class SortByParity2{
	public static void main(String[] args){
		int arr[]={3,2,5,4,9,6,10,14,11};
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		for(int n : arr){
			if(n % 2 == 0) even.add(n);
			else odd.add(n);
		}
		even.addAll(odd);
		for(int n:even) System.out.print(n+" ");
	}
}
