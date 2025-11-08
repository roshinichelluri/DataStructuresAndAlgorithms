import java.util.*;
public class SearchingIn2dArray2{
	public static void main(String[] args){
		int[][] mat = {{2, 8, 12, 16},
				{7, 14, 19, 25}, 
				{15, 22, 34, 38}, 
				{19, 35, 42, 49}};
		int n = mat.length;
		int i = 0, j = n - 1;
		boolean found = false;
		int target = 34;
		//int target = 100;
		while(i <= j){
			if(target == mat[i][j]){
				System.out.println("The indices of Element in the matrix are :" + i + ", " + j);
				found = true;
				break;
			}
			else if(target > mat[i][j]) i++;
			else j--;
		}
		if(!found) System.out.println("No element found");
	}
} 
