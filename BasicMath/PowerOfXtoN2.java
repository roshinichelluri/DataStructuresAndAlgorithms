public class PowerOfXtoN2{
	public static void main(String[] args){
		//we are given 2 integer x, n. now compute x^n using brute force 		//method and binary search(log n TC)
		int res = 1;
		int x = 3;
		int n = 4;
		while(n != 0){
			if(x % 2 == 0){
				x = x * x;
				n /= 2;
			}
			else{
				res = res * x;
				n = n - 1;
			}
		}
		System.out.println(res);
	}
}