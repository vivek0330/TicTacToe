package TicTacToe;

public class TicTacToeGame {

	public static void gameBoard(char[][] grid) {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(grid[i][j] + "|");
			}
			System.out.print(grid[i][2]);
			System.out.println();
			System.out.println("-----");
		}

		for (int j = 0; j < 2; j++) {
			System.out.print(grid[2][j] + "|");
		}
		System.out.print(grid[2][2]);
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		char[][] grid = new char[3][3];
		gameBoard(grid);
	}
}
