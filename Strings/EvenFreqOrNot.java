import java.util.*;
public class EvenFreqOrNot{
    public static void main(String[] args){
        String str = "Hhiiknknhyy";
	str = str.toLowerCase();
	int ans = 0;
	for(char c : str.toCharArray()){
		ans = ans ^ (int)c;
	}
	if(ans == 0) System.out.println("All Frequencies are 2");
	else System.out.println("Not all Frequencies are 2");	
    }
}
