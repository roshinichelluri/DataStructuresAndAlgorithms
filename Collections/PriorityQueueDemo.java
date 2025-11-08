import java.util.*;
public class PriorityQueueDemo{
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(90);
		al.add(58);
		al.add(34);
		al.add(85);
		PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> (y - x));
		System.out.println("Before Sorting: ");
		for(int num : al){
			System.out.print(num + " ");
			pq.add(num);
		}
		System.out.println();
		System.out.println("After Sorting: ");
		while(!pq.isEmpty()){
			int lowest = pq.poll();
			System.out.print(lowest+" ");
		}					
	}
}