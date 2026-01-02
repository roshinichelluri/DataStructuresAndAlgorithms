class SlidingWindow1{
    public static void subarraySumBruteForce(int[] arr, int k){
        int n = arr.length;
        for(int i = 0; i <= n - k; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args){
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        subarraySumBruteForce(arr, k);
    }
}
