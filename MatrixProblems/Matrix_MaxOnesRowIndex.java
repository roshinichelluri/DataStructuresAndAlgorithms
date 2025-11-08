import java.util.*;
public class Matrix_MaxOnesRowIndex{
	public static void main(String[] args){
		int mat[][] = { {0, 0, 1, 1, 1},
				{0, 0, 0, 1, 1},
				{0, 0, 0, 0, 0},
				{0, 1, 1, 1, 1},
				{0, 1, 1, 1, 1} };
		int n = mat.length;
		int m = mat[0].length;
		int index = -1;
		int maxOnes = -1;
		for(int i = 0; i < n; i++){
			int countOnes = 0;
			int firstOne = getFirstOccurence(mat[i], m, 1);
			if(firstOne == -1) countOnes = 0;
			else countOnes = m - firstOne;
			if(countOnes > maxOnes){
				maxOnes = countOnes;
				index = i;
			}
		}
		System.out.println("Row with max no.of Ones is : "+(index+1));
	}
	public static int getFirstOccurence(int arr[], int n, int target){
		int l = 0, h = n - 1;
		int first = -1;
		while(l <= h){
			int m = l + (h - l) / 2;
			if(arr[m] == target){
				first = m;
				h = m - 1;
			}
			else if(target < arr[m]) h = m - 1;
			else l = m + 1;
		}
		return first;
	}
}
			
		