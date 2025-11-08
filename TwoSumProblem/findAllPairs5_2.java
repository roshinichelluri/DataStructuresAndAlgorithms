import java.util.*;

public class findAllPairs5_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the Array");
        int n = sc.nextInt();
        System.out.println("Enter the Elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter TARGET SUM value");
        int target = sc.nextInt();

        List<List<Integer>> res = findAllPairs(arr, n, target);

        System.out.println("Pairs with target Sum are:");
        for(List<Integer> pair : res)
            System.out.println(pair);
    }

    public static List<List<Integer>> findAllPairs(int arr[], int n, int target){
	//duplicate and sorted data
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        for(int num : arr){
            int complement = target - num;

            if(freq.containsKey(complement)){
                for (int i = 0; i < freq.get(complement); i++) {
                    	ArrayList<Integer> temp = new ArrayList<>();
			temp.add(num);
			temp.add(complement);
			result.add(temp);
                }
            }
        }

        return result;
    }
}
