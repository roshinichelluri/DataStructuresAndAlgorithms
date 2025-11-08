import java.util.*;
public class FreqOfCharsInString{
	public static void main(String[] args){
		//METHOD - 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s1 = sc.nextLine();
		freqOfChars(s1);
	}
	public static void freqOfChars(String s1){
		s1 = s1.toLowerCase();
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for(char c : s1.toCharArray()){
			if(Character.isLetter(c))
				hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		for(Map.Entry<Character, Integer> entry : hm.entrySet()){
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
	}
}