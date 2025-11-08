import java.util.Arrays;
public class StringIsograms{
    public static void main(String[] args){
        String str = "MAChine";
	str = str.toLowerCase();
	boolean visited[] = new boolean[26];
	for(char c : str.toCharArray()){
		visited[c - 'a'] = true;
	}
	int count = 0;
	for(boolean val : visited){
		if(val) count ++;
	}
	if(count == str.length()) System.out.println("Isogram");
	else System.out.println("Not Isogram");
    }
}
