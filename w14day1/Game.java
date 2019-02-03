package w14day1;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe gameBoard = new TicTacToe();
		boolean playerWon = false;
		Scanner checkInt = new Scanner(System.in);
		while(playerWon==false) {
			boolean valid = false;
			while(!valid) {
				System.out.println("Player One, aka X, which row do you want to play in? ");
				int r = checkInt.nextInt();
				System.out.println("Which column do you want to play in? ");
				int c = checkInt.nextInt();
				valid = gameBoard.makeMove(r, c, "X");
			}
			gameBoard.printBoard();
			if(gameBoard.playerWon("X")) {
				playerWon=true;
				break;
			}
			if(gameBoard.ifTie()) {
				playerWon = true;
				break;
			}
			valid = false;
			while(!valid) {
				System.out.println("Player Two, aka O, which row do you want to play in? ");
				int row = checkInt.nextInt();
				System.out.println("Which column do you want to play in? ");
				int col = checkInt.nextInt();
				valid = gameBoard.makeMove(row, col, "O");
			}
			gameBoard.printBoard();
			if(gameBoard.playerWon("O")) {
				playerWon=true;
				continue;
			}
			if(gameBoard.ifTie()) {
				playerWon = true;
			}
		}
	}
}