import java.util.Scanner;

public class CancledXOGameApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		int play;
		int charplace = 49;
		boolean isOver = false;
		System.out.println("Hi, do you want to start a new game? (y/n)");
		answer = scan.nextLine();
		System.out.println((answer == "n") ? "bye bye" : "OK, good luck");

		if (answer == "y") {
			char[][] board = new char[3][3];
			for (int row = 0; row < board.length; row++) {
				for (int col = 0; col < board[row].length; col++) {
					board[row][col] = (char) charplace;
					charplace++;
				}

			}
			while (isOver == false) {

				System.out.println("Player X, enter your number");
				play = scan.nextInt();

				if (play == 1) {
					if (board[0][0] != 88 || board[0][0] != 79) {
						board[0][0] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 2) {
					if (board[0][0] != 88 || board[0][0] != 79) {
						board[0][1] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 3) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[0][2] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}

				} else if (play == 4) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[1][0] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				}

				else if (play == 5) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[1][1] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 6) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[1][2] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 7) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[2][0] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 8) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[2][1] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 9) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[2][2] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					}

					else {
						System.out.println("Place is token, choose another place");
					}
				}
				// --------------------------------------------------//

				System.out.println("Player Y, enter your number");
				play = scan.nextInt();
				int temp = 0;

				// ---------------------------------------------------//

				if (play == 1) {

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

				// ---------------------------------------------------//

				else if (play == 2) {
					if (board[0][0] != 88 || board[0][0] != 79) {
						board[0][1] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 3) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[0][2] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}

				} else if (play == 4) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[1][0] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				}

				else if (play == 5) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[1][1] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 6) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[1][2] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 7) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[2][0] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 8) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[2][1] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					} else {
						System.out.println("Place is token, choose another place");
					}
				} else if (play == 9) {
					if (board[0][0] != 88 || board[0][0] != 79) {

						board[2][2] = 88;
						for (int row = 0; row < board.length; row++) {
							for (int col = 0; col < board[row].length; col++) {
								System.out.println(board[row][col]);
							}
						}
					}

					else {
						System.out.println("Place is token, choose another place");
					}
				}
				if (temp == 9) {
					isOver=true;
				}
			}
		}
	}

}

// System.out.println(num + ((num>=12)? " More": " Less") + " than dozen");
/*
 * char[][] matrix=new char[5][5]; for(int row=0; row<matrix.length;row++){
 * for(int col=0; col<matrix[row].length;col++){ if(row==0 || col==0 ||
 * row==matrix.length-1 || col==matrix.length-1) matrix[row][col]='*'; else
 * matrix[row][col]='0'
 * 
 * for (int i = 0; i < 4; i++) { char a = (char) charplace;
 * System.out.println(a); charplace++;
 * 
 */
