package com.example.datastructure.n_game;

/**
 * *****************************************************************************
 * Program for Sudoku Generator
 * *****************************************************************************
 */

public class N02_SudokuGenerator {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * 1. Randomly take any number 1-9.
	 * 2. Check if it is safe to put in the cell. (row-wise safety, column-wise safety and box-wise safety)
	 * 3. If safe, place it and increment to next location and go to step 1.
	 * 4. If not safe, then without incrementing go to step 1.
	 * 5. Once matrix is fully filled, remove k no. of elements randomly to complete game.
	 * 
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * We can improve the solution, if we observe a pattern in this game.
	 * Initially, when all cells are empty, the diagonally present 3x3 matrices are independent of other 3x3 adjacent matrices.
	 * So if we fill them first, then for these only 'box check' is sufficient and thus 'column check','row check' can be skipped.
	 * 
	 *   3 8 5 - - - - - - 
	 *   9 2 1 - - - - - - 
	 *   6 4 7 - - - - - - 
	 *   - - - 1 2 3 - - - 
	 *   - - - 7 8 4 - - - 
	 *   - - - 6 9 5 - - - 
	 *   - - - - - - 8 7 3 
	 *   - - - - - - 9 6 2 
	 *   - - - - - - 1 4 5 
	 * 
	 * ----------
	 * Fill the diagonal 3x3 matrices
	 *   1. Randomly take any number 1-9.
	 *   2. Check if it is safe to put in the cell. (box-wise safety)
	 *   3. If safe, place it and increment to next location and go to step 1.
	 *   4. If not safe, then without incrementing go to step 1.
	 * 
	 * Fill the non-diagonal 3x3 matrices
	 *   1. Randomly take any number 1-9.
	 *   2. Check if it is safe to put in the cell. (row-wise safety, column-wise safety and box-wise safety)
	 *   3. If safe, place it and increment to next location and go to step 1.
	 *   4. If not safe, then without incrementing go to step 1.
	 * 
	 * Once matrix is fully filled, remove k no. of elements randomly to complete game.
	 * 
	 */
}
