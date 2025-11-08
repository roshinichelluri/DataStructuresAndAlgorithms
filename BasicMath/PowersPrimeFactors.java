import java.util.*;
public class PowersPrimeFactors{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		ArrayList<Integer> res = new ArrayList<>();
		
		findPowers(n, res);
	}
	public static void findPowers(int n, ArrayList<Integer> res){
		int count = 0;

		while(n % 2 == 0){
			count++;
			if(!res.contains(2)) res.add(2);
			n /= 2;
		}
		
		for(int i = 3; i*i <= n; i += 2){
			while(n % i == 0){
				if(!res.contains(i)) res.add(i);
				n /= i;
			}
		}
		
		if(n > 1) {
			if(!res.contains(n)) res.add(n);
		}

		for(int x : res){
			System.out.print(x+" ");
		}
		
	}
	
}
		