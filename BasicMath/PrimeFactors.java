import java.util.*;
public class PrimeFactors{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		
		ArrayList<Integer> res = new ArrayList<>();
		res = findPrimeFactors(n);

		System.out.println("The Prime Factors are: ");

		ListIterator<Integer> li = res.listIterator();
		while(li.hasNext()){
			System.out.print(li.next()+" ");
		}

	}
	public static ArrayList<Integer> findPrimeFactors(int n){
		ArrayList<Integer> al = new ArrayList<Integer>();

		if(n <= 1){
			al.clear();
		}
		
		for(int i = 2; i <= n/2; i++){
			if(n % i == 0 && isPrime(i)) al.add(i);
		}
		
		if(isPrime(n)) al.add(n);

		return al;
	}
	public static Boolean isPrime(int n){
		if(n <= 1) return false;
		if(n == 2 || n == 3) return true;
		if(n % 2 == 0 || n % 3 == 0) return false;
		for(int i = 5; i*i <= n; i += 6){
			if(n % i == 0 || n % (i + 2) == 0) return false;
		}
		return true;
	}
}
	
		