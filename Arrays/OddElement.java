public class OddElement{
    public static void main(String[] args){
        int[] arr = {2, 2, 13, 15, 10, 4, 5, 5, 7, 4, 7, 10, 13};
        int ans = 0;
	for(int val : arr)
		ans = ans ^ val;
	System.out.println(ans);
    }
}
