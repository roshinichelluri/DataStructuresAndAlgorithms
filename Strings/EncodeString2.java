public class EncodeString2{
	public static void main(String[] args){
		String s = "aaz";
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			char c = (char) ((s.charAt(i) - 'a' + i) % 26 + 'a');
			res.append(c);
		}
		System.out.println(res);
	}
}