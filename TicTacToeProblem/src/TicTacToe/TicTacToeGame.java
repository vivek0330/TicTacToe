package TicTacToe;

public class TicTacToeGame {

	public static void createEmptyBoard() {
		char[] board = new char[10];
		for (int a = 1; a < board.length; a++) {
			board[a] = ' ';
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome Tic Tac Toe game");
		createEmptyBoard();
	}
}
