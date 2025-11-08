import java.util.*;
public class StackDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Stack<Integer> st = new Stack<>();
		st.push(15);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(60);
		System.out.println(st.empty());

		//METHOD - 4
		st.stream().forEach(s -> System.out.print(s+" "));
	}
}		