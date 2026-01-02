import java.util.*;
public class LongestSubSLength2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Longest Sub String Length : " + 
						getLength(s, s.length()));
	}
	public static int getLength(String s, int n){
		int maxLen = 0;
		int r = 0, l = 0;
		HashMap<Character, Boolean> hm = new HashMap<>();
		while(r < n){
			while(hm.containsKey(s.charAt(r))){
				hm.remove(s.charAt(l));
				l++;
			}
			hm.put(s.charAt(r), true);
			int len = r - l + 1;
			if(len > maxLen) maxLen = len;
			r++;
		}
		return maxLen;
	}
}