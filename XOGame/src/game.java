
public class game {

	int charplace = 49;
	char[][] board = new char[3][3];
	
	
	
	public void startGame() {

		
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = (char) charplace;
				charplace++;
			}

		}
		System.out.println("Player X, enter your number");
	}

	public void move(int playerMove) {
		int temp =0;
		for (int i = 1; i <= 9; i++) {

			if (playerMove == i) {

				if (board[0][0] != 88 || board[0][0] != 79) {
					board[0][0] = 88;
					for (int row = 0; row < board.length; row++) {
						for (int col = 0; col < board[row].length; col++) {
							System.out.println(board[row][col]);
						}
					}
				} else

					for (int row = 0; row < board.length; row++) {
						for (int col = 0; col < board[row].length; col++) {

							if (board[row][col] == 79 || board[row][col] == 88) {
								temp++;
							}

						}
					}
				if (temp == 9) {
					System.out.println("Game over, no winer");
				}

				else {
					System.out.println("Place is token, choose another place");
				}
			}
		}
	}
}