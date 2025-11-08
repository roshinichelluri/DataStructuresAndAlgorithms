import java.util.*;
public class QueueDemo{
	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<>();
		q.add(33);
		q.add(45);
		q.add(76);
		q.add(89);	
		
		System.out.println(q.isEmpty());		

		//METHOD - 1
		ListIterator it = q.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
}		