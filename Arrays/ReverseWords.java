import java.util.*;
public class ReverseWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\.");

        int i = 0;
	int j = words.length - 1;
	while(i <= j){
		String temp = words[i];
		words[i] = words[j];
		words[j] = temp;
		i++;
		j--;
	}
	for(String s : words){
		System.out.print(s + " ");
	}
    }
}
