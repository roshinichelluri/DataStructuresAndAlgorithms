import java.util.*;
public class LongestSubarrayElements{
    public static void main(String[] args){
        int arr[]={10,5,2,7,1,-10};
        int target=15;
        int res=longestSubArrayLength(arr,arr.length,target);
        System.out.print(res);
    }
    public static int longestSubArrayLength(int arr[],int n,int t){
        int maxLen=0;
        int csum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            csum+=arr[i];
            if(hm.containsKey(csum-t)){
                int prev=hm.get(csum-t);
                int len=i-prev;
                if(len>maxLen) maxLen=len;
            }
            if(!hm.containsKey(csum)) hm.put(csum,i);
        }
        return maxLen;
    }
}
