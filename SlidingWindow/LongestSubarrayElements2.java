import java.util.*;
public class LongestSubarrayElements2{
    public static void main(String[] args){
        int arr[]={10,5,2,7,1,-10};
        int target=9;
        int res=longestSubArrayLength(arr,arr.length,target);
        System.out.print(res);
    }
    public static int longestSubArrayLength(int arr[],int n,int t){
        int maxLen=0;
        int csum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            csum+=arr[i];
            if(csum==t) maxLen=i+1;
            else if(hm.containsKey(csum-t)){
                int prev=hm.get(csum-t);
                int len=i-prev;
                if(len>maxLen) maxLen=len;
            }
            if(!hm.containsKey(csum)) hm.put(csum,i);
        }
        return maxLen;
    }
}
