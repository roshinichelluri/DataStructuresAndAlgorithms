import java.util.*;
public class PowerOf3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean res = isPowerOf2(n);
		System.out.println(res);
	}
	//public static boolean isPowerOf2(int n){
	//	for(int i = 1; i <= n; i++){
	//		if(Math.pow(3,i) == n) return true;
	//	}
	//	return false;
	//}

	//public static boolean isPowerOf2(int n){
	//	int i = 1;
	//	while(true){
	//		if((int)Math.pow(3,i) == n) return true;
	//		if((int)Math.pow(3,i) > n) return false;
	//		i++;
	//	}
	//}

	//public static boolean isPowerOf2(int n){
	//	int i = 1;
	//	while(n % 3 == 0) n /= 3;
	//	if(n == 1) return true;
	//	return false;
	//}

	//public static boolean isPowerOf2(int n){
	//	int p = 3;
	//	while(true){
	//		if(p == n) return true;
	//		if(p > n) return false;
	//		p *= 3;
	//	}
	//}

	public static boolean isPowerOf2(int n){
		int x = (int) (Math.log(n)/Math.log(3));
		if(Math.pow(3,x) == n) return true;
		else return false;
	}
		
}