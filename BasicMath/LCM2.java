import java.util.*;
public class LCM2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = getLCM(a,b);
        System.out.println("LCM: "+lcm);
    }
    public static int getLCM(int a, int b){
        int gcd = getGCD(a , b);

        return (a*b)/gcd;
    }
    public static int getGCD(int a, int b){
        while(a%b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        return b;
    }
}