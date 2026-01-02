import java.util.Arrays;
class HoareQuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = hoarePartition(arr, low, high);
            quickSort(arr, low, p);
            quickSort(arr, p + 1, high);
        }
    }
    public static int hoarePartition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true){
            do{
                i++;
            }while (arr[i] < pivot);
            do{
                j--;
            }while (arr[j] > pivot);

            if(i >= j)
                return j;
            swap(arr, i, j);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {8, 4, 1, 2, 9, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
