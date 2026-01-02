import java.util.*;
public class LongestSubSLength{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Longest Sub String Length : " + 
						getLength(s, s.length()));
	}
	public static int getLength(String s, int n){
		int maxLen = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			HashMap<Character, Boolean> hm = new HashMap<>();
			for(int j = i; j < n; j++){
				char c = s.charAt(j);
				if(hm.containsKey(c)) break;
				else{
					hm.put(c, true);
					int len = j - i + 1;
					if(len > maxLen) maxLen = len;
				}
			}
		}
		return maxLen;
	}
}