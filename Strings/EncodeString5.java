public class EncodeString5{
	public static void main(String[] args){
		String s = "hello software world";
		StringBuilder res = new StringBuilder();
		String arr[] = s.split(" ");
		for(int i = 0; i < arr.length; i++){
			String str = arr[i];
			res.append(str.length()).append('#').append(str).append(" ");
		}
		System.out.println(res.toString().trim());
	}
}