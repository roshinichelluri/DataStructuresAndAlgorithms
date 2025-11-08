public class insertionSort{
    public static void main(String[] args) {
        int[] arr={6,4,5,7,3,2,9};
        for(int i=0;i<arr.length-1;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}