import java.util.*;
public class GCD2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = getGCD(a,b);
        System.out.println("GCD: "+gcd);
    }
    public static int getGCD(int a, int b){
	 while(a % b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        return b;
    }
}