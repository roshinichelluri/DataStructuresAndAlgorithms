import java.util.*;
public class RemoveAdjChars{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//METHOD_1
		Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		for(char c : s.toCharArray()){
			if(st.peek() != c) 
				st.push(c);
		}
		String res = "";
		for(char c : st) res += c;
		System.out.println(res);
	}
}