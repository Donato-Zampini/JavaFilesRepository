// TicTacToe.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] board = new char[3][3];
		for(int i = 0; i < 3; i++) //Fill array with -
			for(int j = 0; j < 3; j++)
				board[i][j] = '-';
		boolean win = false;
		int count = 0, x = 0, y = 0;
		while(!win) {
			if(count%2 == 0) {
				System.out.print("Player one: ");
				x = input.nextInt() - 1;
				y = input.nextInt() - 1;
				while(board[x][y] == 'X' || board[x][y] == 'O') {
					System.out.print("Please enter a unoccupied space: ");
					x = input.nextInt() - 1;
					y = input.nextInt() - 1;
				}
				board[x][y] = 'X';
			}
			else if(count%2 == 1) {
				System.out.print("Player two: ");
				x = input.nextInt() - 1;
				y = input.nextInt() - 1;
				while(board[x][y] == 'X' || board[x][y] == 'O') {
					System.out.print("Please enter a unoccupied space: ");
					x = input.nextInt() - 1;
					y = input.nextInt() - 1;
				}
				board[x][y] = 'O';
			}
			if (check(board)) {
				System.out.println("Win");
				print(board);
				break;
			}
			else if(count == 8) {
				System.out.println("Draw");
				print(board);
				break;
			}
			else {
				System.out.println("Unfinished");
				print(board);
				count++;
			}
		}
		input.close();
	}
	public static void print(char[][] list) {
		for(int i = 0; i<list.length; i++) {
			for(int j = 0; j<list[i].length; j++) {
				if(j<list[i].length-1)
					System.out.print(list[i][j]+" ");
				else
					System.out.println(list[i][j]);
			}
		}
	}
	public static boolean check(char[][] list) {
		boolean w = false;
		char o = 'O';
		char x = 'X';
		if(list[0][0] == o && list[1][1] == o && list[2][2] == o)
			return true;
		else if (list[0][0] == o && list[0][1] == o && list[0][2] == o)
			return true;
		else if (list[1][0] == o && list[1][1] == o && list[1][2] == o)
			return true;
		else if (list[2][0] == o && list[2][1] == o && list[2][2] == o)
			return true;
		else if (list[0][0] == o && list[1][0] == o && list[2][0] == o)
			return true;
		else if (list[0][1] == o && list[1][1] == o && list[2][1] == o)
			return true;
		else if (list[0][2] == o && list[1][2] == o && list[2][2] == o)
			return true;
		else if (list[0][2] == o && list[1][1] == o && list[2][0] == o)
			return true;
		if(list[0][0] == x && list[1][1] == x && list[2][2] == x)
			return true;
		else if (list[0][0] == x && list[0][1] == x && list[0][2] == x)
			return true;
		else if (list[1][0] == x && list[1][1] == x && list[1][2] == x)
			return true;
		else if (list[2][0] == x && list[2][1] == x && list[2][2] == x)
			return true;
		else if (list[0][0] == x && list[1][0] == x && list[2][0] == x)
			return true;
		else if (list[0][1] == x && list[1][1] == x && list[2][1] == x)
			return true;
		else if (list[0][2] == x && list[1][2] == x && list[2][2] == x)
			return true;
		else if (list[0][2] == x && list[1][1] == x && list[2][0] == x)
			return true;
		return w;
	}
}