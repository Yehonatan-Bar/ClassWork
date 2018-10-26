import java.util.Scanner;

public class Game {
	static Scanner scan = new Scanner(System.in);
	int charplace = 49;
	static char[][] board = new char[3][3];
	static boolean isXTurn=true;

	public void startGame() {
	
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = (char) charplace;
				charplace++;
							}
		}
		System.out.print("Player "+ (isXTurn? "X":"O") + ", pick your number: ");
	}
	public static void move() {
		int isFull = 0;
		int playerMove = scan.nextInt() - 1;
		//System.out.println("(char)88: " + (char)88 + "  " + "playerMove: "+ playerMove);
		if (board[playerMove / 3][playerMove % 3] != (char) 88 && board[playerMove / 3][playerMove % 3] != (char) 79) {
			board[playerMove / 3][playerMove % 3] = (isXTurn? (char) 88:(char) 79);
			for (int row = 0; row < board.length; row++) {
				System.out.print(board[0][row] + "|");
			}
			System.out.println("\n------");
			for (int row = 0; row < board.length; row++) {
				System.out.print(board[1][row] + "|");
			}	
			System.out.println("\n------");
			for (int row = 0; row < board.length; row++) {
				System.out.print(board[2][row] + "|");
			}
			System.out.println();

		} else {

			for (int row = 0; row < board.length; row++) {
				for (int col = 0; col < board[row].length; col++) {

					if (board[row][col] == (char)79 || board[row][col] == (char)88) {
						isFull++;
					}
				}
			}

			if (isFull>=9) {
				System.out.println("Game over, no winer");
			}

			else {
				System.out.print("Place is token, pick another number: ");
				Game.move();
			}
		}
		if (isFull<9) {
			isXTurn= (isXTurn? false:true);
		
		System.out.print("Player "+ (isXTurn? "X":"Y") + ", pick your number: ");
		Game.move();
		}
	}

}
