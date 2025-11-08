import java.util.Scanner;
import java.util.Arrays; 
public class StringAnagrams{
	public static void main(String[] args){
		//METHOD - 6
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String s2 = sc.nextLine();
		boolean res = areAnagrams(s1, s2);
		System.out.println(res);
	}
	public static boolean areAnagrams(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int ans = 0;
		for(char c : s1.toCharArray()){
			ans = ans ^ (int)c;
		}
		for(char c : s2.toCharArray()){
			ans = ans ^ (int)c;
		}
		return ans == 0;
	}
}