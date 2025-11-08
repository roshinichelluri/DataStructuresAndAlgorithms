import java.util.*;
public class SearchingIn2dArray3{
	public static void main(String[] args){
		int[][] mat = {{2, 8, 12, 16},
				{7, 14, 19, 25}, 
				{15, 22, 34, 38}, 
				{19, 35, 42, 49}};
		int n = mat.length;
		int target = 42;
		//int target = 100;
		boolean found = false;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(mat[i][j] == target){
					found = true;
					System.out.println("The indices are :" + i + "," + j);
					break;
				}
			}
		}
		if(!found) System.out.println("No element found");
	}
}