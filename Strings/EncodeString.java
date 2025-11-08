public class EncodeString{
	public static void main(String[] args){
		String s = "azby";
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			if(i % 2 == 0){
				if(s.charAt(i) == 'a') res.append('z');
				else res.append((char)(s.charAt(i)-1));
			}
			else{
				if(s.charAt(i) == 'z') res.append('a');
				else res.append((char)(s.charAt(i)+1));
			}
		}
		System.out.println(res);
	}
}
