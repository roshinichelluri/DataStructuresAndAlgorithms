public class isFactorPerfect{
	public static void main(String[] args){
		
		//TC - O(sqrt(N))
		
		int n = 28;
		int sum = 1;
		
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				sum += i;
				if(n/i != i)
					sum += n/i;
			}
		}
	
		if(sum == n)
			System.out.println(n+" is Perfect Number");
		else
			System.out.println(n+" is not Perfect Number");
		
	}
}