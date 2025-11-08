public class EncodeString3{
	public static void main(String[] args){
		String s = "crazy";
		int d = 2;
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			char c = (char) ((s.charAt(i) - 'a' + d) % 26 + 'a');
			res.append(c);
		}
		System.out.println(res);
	}
}