// Online Java Compiler
import java.util.*;
class MaxKSumSubArray{
    public static void main(String[] args) {
        //Max sub array with sum equivalent to k
        int[] arr = {1,2,1,1,3,2};
        int k = 4;
        int n = arr.length;
        int maxLen = 0;
        
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum == k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        System.out.println(maxLen);
    }
}