public class RecursiveInsertionSort{
    public static void main(String[] args){
        int[] arr = {7,5,6,9,8,10,1};
        recursiveInsertionSort(arr,0);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void recursiveInsertionSort(int[] arr, int i){
        if(i==arr.length) return;
        
        int j = i;
        while(j>0&&arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }

        recursiveInsertionSort(arr,i+1);
    }
}