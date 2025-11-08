import java.util.*;
public class Matrix_MaxOnesRowIndex2{
	public static void main(String[] args){
		int mat[][] = { {0, 0, 1, 0, 1},
				{0, 0, 0, 1, 1},
				{1, 1, 1, 0, 0},
				{0, 1, 0, 1, 0},
				{0, 1, 1, 0, 1} };
		int n = mat.length;
		int m = mat[0].length;
		int index = -1;
		int maxOnes = -1;
		for(int i = 0; i < n; i++){
			int countOnes = 0;
			for(int j = 0; j < m; j++){
				countOnes += mat[i][j];
			}
			if(countOnes > maxOnes){
				maxOnes = countOnes;
				index = i;
			}
			//if we need to return max Index 
			//else if(countOnes == maxOnes){
			//	index = Math.max(index, i);
			//}
		}
		System.out.println("Row with max no.of Ones is : "+(index+1));
	}
}
			
		