import java.util.*;
public class ArraylistDemo{
	public static void main(String[] args){

		List<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(20);
		li.add(25);
		li.add(30);
		li.add(37);
		li.add(5);
		li.add(10);

		//Counting how many times 5 exists

		int count = 0;
		for(int i = 0; i < li.size(); i++){
			if(li.get(i) == 5){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
		