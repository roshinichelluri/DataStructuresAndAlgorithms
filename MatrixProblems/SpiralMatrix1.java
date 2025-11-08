public class SpiralMatrix1{
	public static void main(String[] args){
		int mat[][] = { {1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25} };
		int n = mat.length;
		int m = mat[0].length;
		int top = 0, bottom = n - 1;
		int left = 0, right = m - 1;
		int dir = 0;
		while(left <= right && top <= bottom){
			if(dir == 0){
				for(int i = left; i <= right; i++){
					System.out.print(mat[top][i] + " ");
				}top++;

			}
			else if(dir == 1){
				for(int i = top; i <= bottom; i++){
					System.out.print(mat[i][right] + " ");
				}right--;
			}
			else if(dir == 2){
				for(int i = right; i >= left; i--){
					System.out.print(mat[bottom][i] + " ");
				}bottom--;
			}
			else if(dir == 3){
				for(int i = bottom; i >= top; i--){
					System.out.print(mat[i][left] + " ");
				}left++;
			}
			dir = (dir + 1) % 4;
		}
	}
}
			
