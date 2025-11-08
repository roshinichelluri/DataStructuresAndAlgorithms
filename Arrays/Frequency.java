import java.util.*;
public class Frequency{
	public static void main(String[] main){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the elements: ");
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		TreeMap<Integer, Integer> hm = new TreeMap<>(Collections.reverseOrder());

		for(int i = 0; i < n; i++){
			if(hm.containsKey(a[i]))
				hm.put(a[i], hm.get(a[i])+1);
			else
				hm.put(a[i], 1);
		}

		Set<Integer> s = hm.keySet();
		System.out.println("The Frequency of each element: ");

		for(int x : s){
			System.out.println(x+" : "+hm.get(x));
		}
	}
}