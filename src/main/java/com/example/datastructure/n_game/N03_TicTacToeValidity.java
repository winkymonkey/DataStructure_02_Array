package com.example.datastructure.n_game;

/**
 * *****************************************************************************
 * Validity of a given Tic-Tac-Toe board configuration
 * *****************************************************************************
 * Input:  board = ["O  ", "   ", "   "]
 * Output: false								//The first player always plays "X".
 * 
 * Input:  board = ["XOX", " X ", "   "]
 * Output: false								//Players take turns making moves.
 * 
 * Input:  board = ["XXX", "   ", "OOO"]
 * Output: false
 * 
 * Input:  board = ["XOX", "O O", "XOX"]
 * Output: true
 * *****************************************************************************
 */

public class N03_TicTacToeValidity {
	/*
	 * The problem only asks if the given board is valid.
	 * 
	 * A board is valid only if
	 *    1. number of X - number of O == 0
	 *    2. number of X - number of O == 1
	 * 
	 * If the "number of X - number of O == 0"
	 * 	- in this case, we need to check player X does NOT win.
	 * 	- because if player X wins, then player O must be less than player X.
	 * 
	 * If the "number of X - number of O = 1"
	 * 	- in this case, we need to check player O does NOT win.
	 * 	- because if player O wins, the game has stopped and player X cannot be greater than player O.
	 * 
	 */

	public static void main(String[] args) {
		String[] board = { "XOX", " X ", "   " };
		validTicTacToe(board);
	}
	
	
	private static boolean validTicTacToe(String[] board) {
		char[][] gameBoard = new char[3][3];
		for (int i = 0; i < 3; i++) { 					// [X, O, X]
			gameBoard[i] = board[i].toCharArray(); 		// [ , X,  ]
		} 												// [ ,  ,  ]

		int numOfX = 0;
		int numOfO = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				char c = gameBoard[i][j];

				if (c == 'X')
					numOfX++;
				else if (c == 'O')
					numOfO++;
			}
		}

		if (numOfX - numOfO < 0 || numOfX - numOfO > 1) {
			return false;
		}
		if (numOfX - numOfO == 1) {
			if (hasWon(gameBoard, 'O')) {
				return false;
			}
		}
		if (numOfX - numOfO == 0) {
			if (hasWon(gameBoard, 'X')) {
				return false;
			}
		}
		return true;
	}
	
	
	private static boolean hasWon(char[][] gameBoard, char player) {
		for (int i = 0; i < 3; i++) {
			if (gameBoard[i][0] == player 
				&& gameBoard[i][1] == gameBoard[i][0] 
				&& gameBoard[i][2] == gameBoard[i][1]) {		//if all cells in a ROW contains the char
				return true;
			}

			if (gameBoard[0][i] == player 
				&& gameBoard[1][i] == gameBoard[0][i] 
				&& gameBoard[2][i] == gameBoard[1][i]) {		//if all cells in a COLUMN contains the char
				return true;
			}

			if (gameBoard[0][0] == player 
				&& gameBoard[0][0] == gameBoard[1][1] 
				&& gameBoard[1][1] == gameBoard[2][2]) {		//if all cells in a LEFT-DIAGONAL contains the char
				return true;
			}

			if (gameBoard[0][2] == player 
				&& gameBoard[1][1] == gameBoard[0][2] 
				&& gameBoard[1][1] == gameBoard[2][0]) {		//if all cells in a RIGHT-DIAGONAL contains the char
				return true;
			}
		}
		return false;
	}
	
}
