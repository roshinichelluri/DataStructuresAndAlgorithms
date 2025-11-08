public class Sort0s1s2s{
	public static void main(String[] args){
		int[] arr = {0,1,2,0,1,2};
		int x = 0,y = 0,z = 0;
		for(int num : arr){
			if(num == 0)x++;
			else if(num == 1)y++;
			else z++;
		}
		int[] res = new int[arr.length];
		int i = 0;
		while(x-->0) res[i++]=0;
		while(y-->0) res[i++]=1;
		while(z-->0) res[i++]=2;
		for(int n:res)
			System.out.print(n+" ");
	}
}
