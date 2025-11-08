import java.util.*;
public class MapDemo{
	public static void main(String[] args){
		LinkedHashMap<Integer,Double> hm = new LinkedHashMap<>();
		System.out.println("Input Order");
		hm.put(601, 8.9);
		hm.put(602, 7.8);
		hm.put(603, 6.7);
		hm.put(604, 8.8);
		hm.put(605, 9.0);
		hm.put(606, 8.8);
		hm.put(607, 7.6);
		hm.put(608, 6.5);
		hm.put(609, 8.5);
		hm.put(610, 8.9);
		hm.put(611, 9.1);
		hm.put(612, 8.6);
		hm.put(613, 7.4);
		hm.put(614, 6.8);
		hm.put(615, 8.3);
		hm.put(616, 8.7);
		hm.put(617, 9.0);
		hm.put(618, 8.4);
		hm.put(619, 7.2);
		hm.put(620, 6.9);
		Set<Integer> s = hm.keySet();
		for(int x : s){
			System.out.println(x+" : "+hm.get(x));
		}
	}
}
		

		