import java.util.Scanner;
public class StringReverseUsing2Pointers{
	public static String reverse(String s){
		char arr[] = s.toCharArray();
		int i = 0; 
		int j = arr.length - 1;
		while(i < j){
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return new String(arr);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = reverse(str);
		System.out.println(rev);
	}
	
}