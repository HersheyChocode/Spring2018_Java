package w14day1;
import java.util.Scanner;
public class GameVsComp {
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
				int row;
				int col;
				BoardLocation winValues = gameBoard.winable("O");
				System.out.println("Computer, aka O, which row do you want to play in? ");
				if(winValues.row>=0) {
					row = winValues.row;
					col = winValues.col;
				} else {
					BoardLocation values = gameBoard.blockable("X");
					row = values.row;
					col = values.col;
				}
				System.out.println("Which column do you want to play in? ");
				System.out.println(row +" and "+ col);
				valid = gameBoard.makeMove(row, col, "O");
				break;
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