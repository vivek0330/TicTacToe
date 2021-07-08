package TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	
	static char PLAYER , COMPUTER ;
	
	public static void createEmptyBoard() {
		char[] board = new char[10];
		for (int a = 1; a < board.length; a++) {
			board[a] = ' ';
		}
	}
	
	public static char playerChoose(char CHOOSE_LETTER) {
		if (CHOOSE_LETTER == 'O') {
			PLAYER = 'O';
			COMPUTER = 'X';
		} else if (CHOOSE_LETTER == 'X') {
			PLAYER = 'X';
			COMPUTER = 'O';
		} else {
			System.out.println("Enter invalid character");
		}
		return PLAYER;
		
	} 

	public static void main(String[] args) {
		System.out.println("Welcome Tic Tac Toe game");
		createEmptyBoard();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a letter X or O :: ");
		char CHOOSE_LETTER = sc.next().charAt(0);
		playerChoose(CHOOSE_LETTER);
		sc.close();
	}
}
