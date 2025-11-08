public class mergeSort{
    public static void main(String[] args){
        int[] arr={3,2,2,4,1,5,2,6,4,9};
        int low=0;
        int high=arr.length-1;
        mergeSort(arr,low,high);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid=(low + high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[], int low, int mid, int high){
        int left=low;
        int right=mid+1;
        int k=0;
        int temp[]=new int[high-low+1];
        while(left<=mid&&right<=high){
            if(arr[left]<arr[right]){
                temp[k++]=arr[left++];
            }
            else{
                temp[k++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[k++]=arr[left++];
        }
        while(right<=high){
            temp[k++]=arr[right++];
        }
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
    }
}