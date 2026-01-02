import java.util.*;
public class IndicesOfPAnagramsinS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();
		List<Integer> res = getIndices(s, p);
		for(int x : res) System.out.print(x + " ");
	}
	public static List<Integer> getIndices(String s, String p){
		int n = s.length();
		int k = p.length();
		//Brute Force Method
		List<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i <= n - k; i++){
			StringBuilder subS = new StringBuilder();
			for(int j = i; j < i + k; j++){
				subS.append(s.charAt(j));
			}
			if(areAnagrams(subS.toString(), p, k)){
				res.add(i);
			}
		}
		return res;
	}
	public static boolean areAnagrams(String a, String b, int n){
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i = 0; i < n; i++){
			if(arr1[i] != arr2[i]) return false;
		}
		return true;
	}
}