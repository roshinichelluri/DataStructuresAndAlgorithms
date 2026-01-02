import java.util.*;
public class IndicesOfPAnagramsinS2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();
		List<Integer> res = indices(s, p);
		for(int x : res) System.out.print(x + " ");
	}
	public static ArrayList<Integer> indices(String s, String p){
		ArrayList<Integer> res = new ArrayList<>();
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		int n = s.length();
		int k = p.length();
		for(int i = 0; i < k; i++){
			arr1[p.charAt(i) - 'a']++;
		}
		for(int i = 0; i < k; i++){
			arr2[s.charAt(i) - 'a']++;
		}
		if(Arrays.equals(arr1, arr2)) res.add(0);
		for(int i = k; i < n; i++){
			arr2[s.charAt(i - k) - 'a']--;
			arr2[s.charAt(i) - 'a']++;
			if(Arrays.equals(arr1, arr2)) res.add(i - k + 1);
		}
		return res;
	}
}