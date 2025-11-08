import java.util.Scanner;
import java.util.Arrays;
public class StringPangrams{
	public static void main(String[] args){
		//METHOD - 4
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s1 = sc.nextLine();
		boolean res = arePangrams(s1);
		System.out.println(res);
	}
	public static boolean arePangrams(String s1){
		s1 = s1.toLowerCase();
		boolean visited[] = new boolean[26];
		for(char c : s1.toCharArray()){
			if(Character.isLetter(c))
				visited[c - 'a'] = true;
		}
		for(int i = 0; i < 26; i++){
			if(!visited[i]) return false;
		}
		return true;
	}
}