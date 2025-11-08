import java.util.*;
public class GCD3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = getGCD(a,b);
        System.out.println("GCD: "+gcd);
    }
    public static int getGCD(int a, int b){
        int res = Math.min(a , b);
        while(res > 1){
            if(a % res == 0 && b % res == 0){
                return res;
            }
            res--;
        }
        return res;

    }
}