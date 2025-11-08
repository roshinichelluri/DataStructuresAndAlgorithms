public class PowerOfXtoN{
	public static void main(String[] args){
		//we are given 2 integer x, n. now compute x^n using brute force 		//method and binary search(log n TC)
		int res = 1;
		int x = 3;
		int n = 5;
		for(int i = 0; i < n; i++){
			res *= x;
		}
		System.out.println(res);
	}
}