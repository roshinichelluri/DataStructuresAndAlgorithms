import java.util.*;
public class LCM1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = getLCM(a,b);
        System.out.println("LCM: "+lcm);
    }
    public static int getLCM(int a, int b){
        int x = Math.min(a,b);
        int y = Math.max(a,b);

        for(int i = x; i <= a*b; i = i+x){

            if(i % y == 0){
                return i ;
            }
        }
        return a * b;
    }
}