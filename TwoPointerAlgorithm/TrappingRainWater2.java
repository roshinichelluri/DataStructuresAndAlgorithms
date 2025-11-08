public class TrappingRainWater2{
    public static void main(String[] args){
        int a[] = {3, 0, 2, 0, 4, 0, 1};
        int n = a.length;
	int res = 0;
	int[] lmax = new int[n];
	int rmax[] = new int[n];
	lmax[0] = a[0];
	rmax[n - 1] = a[n - 1];
	for(int i = 1; i < n; i++){
            lmax[i] = Math.max(a[i], lmax[i - 1]);
	}
	for(int i = n - 2; i >= 0; i--){
            rmax[i] = Math.max(a[i], rmax[i + 1]);
	}
	for(int i = 0; i < n; i++){
		res += ((Math.min(lmax[i], rmax[i])) - a[i]);
	}
        System.out.println(res);
    }
}
