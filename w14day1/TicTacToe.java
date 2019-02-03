package w14day1;
import apcs.Window;
public class TicTacToe {

	private String[][]board = new String[3][3];

	public TicTacToe() {
		for(int i=0;i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = " ";
			}
		}
	}

	public boolean makeMove(int r, int c, String symbol) {
		if(board[r][c].equals(" ")) {
			if(r>3|c>3||r<0||c<0) {
				System.out.println("N/A");
				return false;
			}else{
				board[r][c] = symbol;
				return true;
			}
		}else {
			System.out.println("N/A");
			return false;
		}	
	}

	public boolean ifTie() {
		int count = 0;
		for(int i=0;i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i][j]=="X"||board[i][j]=="O") {
					count++;
				}
			}
		}if(count==9) {
			System.out.println("No! It's a tie!");
			return true;
		}else {
			return false;
		}
	}

	public void printBoard() {
		for(int i=0;i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(board[i][j]+"|");
			}
			System.out.print("\n------\n");
		} System.out.print("\n");
	}

	public boolean playerWon(String symbol) {
		for(int i=0;i<3; i++) {
			if(board[i][0].equals(symbol)&&board[i][1].equals(symbol)&&board[i][2].equals(symbol)) {
				System.out.println(symbol + " won! Yay!");
				return true;
			}else if(board[0][i].equals(symbol)&&board[1][i].equals(symbol)&&board[2][i].equals(symbol)) {
				System.out.println(symbol + " won! Yay!");
				return true;
			}
		}
		if(board[0][0].equals(symbol)&&board[1][1].equals(symbol)&&board[2][2].equals(symbol)) {
			System.out.println(symbol + " won! Yay!");
			return true;
		}else if(board[0][2].equals(symbol)&&board[1][1].equals(symbol)&&board[2][0].equals(symbol)) {
			System.out.println(symbol + " won! Yay!");
			return true;
		}
		return false;
	}

	public BoardLocation blockable(String symbol) {
		int count;
		//across check
		for(int i=0;i<3; i++) {
			count = 0;
			for(int j=0; j<3; j++) {
				if(board[i][j].equals(symbol)) {
					count+=1;
				}
			}
			if(count==2) {
				for(int j=0; j<3; j++) {
					if(board[i][j].equals(" ")) {
						return new BoardLocation(i,j);
					}
				}
			}
		}

		//vertical check
		for(int i=0; i<3; i++) {
			count = 0;
			for(int j=0; j<3; j++) {
				if(board[j][i].equals(symbol)) {
					count+=1;
				}

			}
			if(count==2) {
				for(int j=0; j<3; j++) {
					if(board[j][i].equals(" ")) {
						return  new BoardLocation(j,i);
					}
				}

			}
		}
		//diagonal check
		if(board[0][0].equals(symbol)&&board[1][1].equals(symbol)&&board[2][2].equals(" ")) {
			return new BoardLocation(2,2);
		} else if(board[0][0].equals(symbol)&&board[2][2].equals(symbol)&&board[1][1].equals(" ")) {
			return new BoardLocation(1,1);
		} else if (board[1][1].equals(symbol)&&board[2][2].equals(symbol)&&board[0][0].equals(" ")) {
			return new BoardLocation(0,0);
		}
		//diagonal check
		if(board[0][2].equals(symbol)&&board[1][1].equals(symbol)&&board[2][0].equals(" ")) {
			return new BoardLocation(2,0);
		} else if(board[1][1].equals(symbol)&&board[2][0].equals(symbol)&&board[0][2].equals(" ")) {
			return new BoardLocation(0,2);
		} else if(board[0][2].equals(symbol)&&board[2][0].equals(symbol)&&board[1][1].equals(" ")) {
			return new BoardLocation(1,1);
		}
		int r = Window.random(0, 2);
		int c = Window.random(0, 2);
		while(!board[r][c].equals(" ")) {
			r = Window.random(0, 2);
			c = Window.random(0, 2);
		}
		return new BoardLocation(r,c);	
	}

	public BoardLocation winable(String symbol) {
		int count;
		//across check
		for(int i=0;i<3; i++) {
			count = 0;
			for(int j=0; j<3; j++) {
				if(board[i][j].equals(symbol)) {
					count+=1;
				}
			}
			if(count==2) {
				for(int j=0; j<3; j++) {
					if(board[i][j].equals(" ")) {
						return new BoardLocation(i,j);
					}
				}
			}
		}

		//vertical check
		for(int i=0; i<3; i++) {
			count = 0;
			for(int j=0; j<3; j++) {
				if(board[j][i].equals(symbol)) {
					count+=1;
				}

			}
			if(count==2) {
				for(int j=0; j<3; j++) {
					if(board[j][i].equals(" ")) {
						return  new BoardLocation(j,i);
					}
				}

			}
		}
		//diagonal check
		if(board[0][0].equals(symbol)&&board[1][1].equals(symbol)&&board[2][2].equals(" ")) {
			return new BoardLocation(2,2);
		} else if(board[0][0].equals(symbol)&&board[2][2].equals(symbol)&&board[1][1].equals(" ")) {
			return new BoardLocation(1,1);
		} else if (board[1][1].equals(symbol)&&board[2][2].equals(symbol)&&board[0][0].equals(" ")) {
			return new BoardLocation(0,0);
		}
		//diagonal check
		if(board[0][2].equals(symbol)&&board[1][1].equals(symbol)&&board[2][0].equals(" ")) {
			return new BoardLocation(2,0);
		} else if(board[1][1].equals(symbol)&&board[2][0].equals(symbol)&&board[0][2].equals(" ")) {
			return new BoardLocation(0,2);
		} else if(board[0][2].equals(symbol)&&board[2][0].equals(symbol)&&board[1][1].equals(" ")) {
			return new BoardLocation(1,1);
		}
		if(board[1][1].equals(" ")) {
			return new BoardLocation(1,1);
		}
		return new BoardLocation(-1,-1);

	}


}
