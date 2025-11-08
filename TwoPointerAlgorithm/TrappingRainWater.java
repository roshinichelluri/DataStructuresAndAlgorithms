public class TrappingRainWater{
    public static void main(String[] args){
        int a[] = {2, 1, 0, 5, 0, 0, 1, 3};
        int n = a.length;
        int l = 0,r = n-1, lmax = 0, rmax = 0, res = 0;
        while(l <= r){
            if(a[l] <= a[r]){
                if(a[l] >= lmax) lmax = a[l];
                else res += lmax-a[l];
                l++;
            }else{
                if(a[r] >= rmax) rmax = a[r];
                else res += rmax-a[r];
                r--;
            }
        }
        System.out.println(res);
    }
}
