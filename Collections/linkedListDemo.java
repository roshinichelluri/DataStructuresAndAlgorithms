import java.util.*;
public class linkedListDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		ll.add(80);

		ll.removeFirst();

		//Method - 2
		for(int x : ll){
			System.out.print(x+" ");
		}	
	}
}