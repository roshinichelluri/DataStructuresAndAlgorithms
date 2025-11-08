public class RecursiveBubbleSort{
    public static void main(String[] args){
        int[] arr={12,1,78,56,13,67,54,35};
        recursiveBubbleSort(arr, arr.length, 0);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void recursiveBubbleSort(int[] arr, int n, int j){
        if(n==1) return;
        if(j==n-1){
            recursiveBubbleSort(arr,n-1,0);
            return;
        }
        if(arr[j]>arr[j+1]){
            int temp =arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        recursiveBubbleSort(arr,n,j+1);
    }
}