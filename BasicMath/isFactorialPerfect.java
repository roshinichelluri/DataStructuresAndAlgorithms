public class isFactorialPerfect{
	public static void main(String[] args){

		int n = 145;
		int org = n;

		int sumFact = 0;
		while(n != 0){
			int ld = n % 10;

			int fact = 1;
			while(ld != 0){
				fact = fact * ld;
				ld--;
			}

			sumFact += fact;

			n = n / 10;
		}

		if(sumFact == org)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
	}
}