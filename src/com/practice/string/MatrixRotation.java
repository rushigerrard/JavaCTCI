package com.practice.string;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] oddMatrix = new int[][]{{1, 2, 3},
										{4, 5, 6}, 
										{7, 8, 9} };
										
		int[][] evenMatrix = new int[][]{{1, 2, 3, 4},
										 {5, 6, 7, 8},
										 {9, 10, 11, 12},
										 {13, 14, 15, 16} };
		rotateMatrix(oddMatrix);
		
		for(int i =  0; i < oddMatrix[0].length; i++){
			for(int j = 0; j < oddMatrix[0].length; j++){
				System.out.print(oddMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		rotateMatrix(evenMatrix);
		
		for(int i =  0; i < evenMatrix[0].length; i++){
			for(int j = 0; j < evenMatrix[0].length; j++){
				System.out.print(evenMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void rotateMatrix(int[][] matrix) {
		int n = matrix[0].length;
		if(n % 2 == 0){
			evenRotation(matrix, n, 0, n - 1);
		}else{
			oddRotation(matrix, n, 0, n - 1);
		}
	}

	private static void evenRotation(int[][] matrix, int n, int s, int e) {

		int tmp = matrix[s][s];
		matrix[s][s] = matrix[e][s];
		matrix[e][s] = matrix[e][e];
		matrix[e][e] = matrix[s][e];
		matrix[s][e] = tmp;
		
		if(n == 2){
			return;
		}
		for(int i = s + 1; i < e; i++){
			tmp = matrix[s][i];
			matrix[s][i] = matrix[i][e];
			matrix[i][e] = tmp;
			
			tmp = matrix[e][i];
			matrix[e][i] = matrix[i][s];
			matrix[i][s] = tmp;
		}
		
		for(int i = s + 1; i < e; i++){
			tmp = matrix[s][i];
			matrix[s][i] = matrix[e][e - i];
			matrix[e][e - i] = tmp;
			
		}
		evenRotation(matrix, n - 2, s + 1, e - 1);
	}

	private static void oddRotation(int[][] matrix, int n, int s, int e) {
		if(n == 1)
			return ;
		
		int tmp = matrix[s][s];
		matrix[s][s] = matrix[e][s];
		matrix[e][s] = matrix[e][e];
		matrix[e][e] = matrix[s][e];
		matrix[s][e] = tmp;
		
		for(int i = s + 1; i < e; i++){
			tmp = matrix[s][i];
			matrix[s][i] = matrix[i][e];
			matrix[i][e] = tmp;
			
			tmp = matrix[e][i];
			matrix[e][i] = matrix[i][s];
			matrix[i][s] = tmp;
		}
		
		for(int i = s + 1; i < e; i++){
			tmp = matrix[s][i];
			matrix[s][i] = matrix[e][e - i];
			matrix[e][e - i] = tmp;
			
		}
		oddRotation(matrix, n - 2, s + 1, e - 1);
	}

}
