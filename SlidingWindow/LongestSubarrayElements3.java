import java.util.*;
public class LongestSubarrayElements3{
    public static void main(String[] args){
        int arr[]={10,-10,20,-15,30};
        int target=5;
        int res=longestSubArrayLength(arr,arr.length,target);
        System.out.print(res);
    }
    public static int longestSubArrayLength(int arr[],int n,int t){
        int maxLen=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==t){
                    int len=j-i+1;
                    if(len>maxLen) maxLen=len;
                }
            }
        }
        return maxLen;
    }
}
