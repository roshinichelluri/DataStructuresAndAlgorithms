public class CompressString{
	public static void main(String[] args){
		String s = "aabbbbbbbbbbbbbbbcccaaaaaaaaaaaddcc";
		StringBuilder res = new StringBuilder();
		int count = 1;
		res.append(s.charAt(0));
		for(int i = 1; i < s.length(); i++){
			if(s.charAt(i) == s.charAt(i - 1)){
				 count++;
			}
			else{
				//res.append(count);
				//res.append(Integer.toHexString(count));
				res.append(Integer.toOctalString(count));
				res.append(s.charAt(i));
				count = 1;
			}
		}
		res.append(count);
		System.out.println(res);
	}
}