import java.util.*;
public class RemoveAdjChars2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		//METHOD_2
		int s = 0,e = 1;
		while(e < str.length()){
			while(e < str.length() && str.charAt(e) == str.charAt(s))
				e++;
			res += str.charAt(s);
			s = e;
			e++;
		}
		if(s == str.length()-1) res+=str.charAt(s);
		System.out.println(res);
	}
}
