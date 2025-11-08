import java.util.*;
public class Factors{
	public static void main(String[] args){
		
		//TC- O(sqrt(n))

		int n = 78;
	
		int res = factors(n);

		System.out.println("The number "+n+" have "+res+" factors");
		
	}
	public static int factors(int n){

		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 1; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				al.add(i);
				if(n/i != i)
					al.add(n/i);	
			}
		}
		return al.size();
		
	}	
}
