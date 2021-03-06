package com.example.datastructure.n_game;

import java.util.*;

/**
 * *****************************************************************************
 * Check if given Sudoku board configuration is valid or not
 * *****************************************************************************
 */

public class N01_SudokuValidity {
	
	public static void main(String args[]) {
		int [][] board = {						// A valid board.
		    {1, 4, 7, 0, 0, 0, 0, 0, 3},
		    {2, 5, 0, 0, 0, 1, 0, 0, 0},
		    {3, 0, 9, 0, 0, 0, 0, 0, 0},
		    {0, 8, 0, 0, 2, 0, 0, 0, 4},
		    {0, 0, 0, 4, 1, 0, 0, 2, 0},
		    {9, 0, 0, 0, 0, 0, 6, 0, 0},
		    {0, 0, 3, 0, 0, 0, 0, 0, 9},
		    {4, 0, 0, 0, 0, 2, 0, 0, 0},
		    {0, 0, 1, 0, 0, 8, 0, 0, 7},
	    };
		print_board(board);
		isValidBoard(board);
		
		int [][] board2 = {						// An invalid board. The first row contains repeated values.
		    {1, 4, 4, 0, 0, 0, 0, 0, 3},
		    {2, 5, 0, 0, 0, 1, 0, 0, 0},
		    {3, 0, 9, 0, 0, 0, 0, 0, 0},
		    {0, 8, 0, 0, 2, 0, 0, 0, 4},
		    {0, 0, 0, 4, 1, 0, 0, 2, 0},
		    {9, 0, 0, 0, 0, 0, 6, 0, 0},
		    {0, 0, 3, 0, 0, 0, 0, 0, 9},
		    {4, 0, 0, 0, 0, 2, 0, 0, 0},
		    {0, 0, 1, 0, 0, 8, 0, 0, 7},
	    };
		print_board(board2);
		isValidBoard(board2);
	}
	
	
	
	public static void isValidBoard(int[][] board) {
		for (int i = 0; i < 9; i++) {
			int result1 = isValidRow(i, board);
			int result2 = isValidCol(i, board);
			if (result1 < 1 || result2 < 1) {
				System.out.println("The board is invalid.");
				return;
			}
		}
		int result3 = isValidSubsquares(board);
		if (result3 < 1)
			System.out.println("The board is invalid.");
		else
			System.out.println("The board is valid.");
	}
	
	
	public static int isValidRow(int row, int[][] board) {
		int temp[] = board[row];
		Set<Integer> set = new HashSet<Integer>();
		for (int value : temp) {
			if (value < 0 || value > 9) {				//checking for valid values (0 is valid as it denotes an empty cell)
				return -1;								//denotes that the row contains an invalid value
			}
			else if (value != 0) {						//checking for repeated values
				if (set.add(value) == false) {
					return 0;							//denotes that the row contains repeated values
				}
			}
		}
		return 1;										//denotes that the row is valid
	}
	
	
	public static int isValidCol(int col, int[][] board) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 9; i++) {
			if (board[i][col] < 0 || board[i][col] > 9) {	//checking for valid values (0 is valid as it denotes an empty cell)
				return -1;									//denotes that the column contains an invalid value
			}
			else if (board[i][col] != 0) {					//checking for repeated values
				if (set.add(board[i][col]) == false) {
					return 0;								//denotes that the column contains repeated values
				}
			}
		}
		return 1;											//denotes that the column is valid
	}
	
	
	public static int isValidSubsquares(int[][] board) {
		for (int row = 0; row < 9; row += 3) {
			for (int col = 0; col < 9; col += 3) {
				
				Set<Integer> set = new HashSet<Integer>();
				for (int r = row; r < row + 3; r++) {
					for (int c = col; c < col + 3; c++) {
						if (board[r][c] < 0 || board[r][c] > 9) {	//checking for valid values (0 is valid as it denotes an empty cell)
							return -1;								//denotes that the sub-square contains an invalid value
						}
						else if (board[r][c] != 0) {				//checking for repeated values
							if (set.add(board[r][c]) == false) {
								return 0;							//denotes that the sub-square contains repeated values
							}
						}
					}
				}
			}
		}
		return 1;													//denotes that the sub-square is valid
	}
	
	
	//print the board
	public static void print_board(int[][] grid) {
		for (int[] row : grid) {
			System.out.print("[");
			for (int y : row) {
				System.out.print(y + ", ");
			}
			System.out.println("]");
		}
	}
	
}
