package edu.jsu.mcis;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TicTacToe {

	char turn;
	boolean draw=false;
	char[][] board = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
	
	private boolean concurrentGame;
	//Constructor for board
	public TicTacToe(){
		
		
		
		
		for (int row=0; row < board.length;row++){
			
			Arrays.fill(board[row], ' ');
		}
		
	}
	
	public void displayBoard(){
		
		
		
		
		
		for (int row=0; row<board.length;row++){
			for (int col=0;col<board[0].length;col++){
				System.out.print("\t"+board[row][col]);
				//print bar
				if (col== 0 || col==1){
					System.out.print("|");
				}
			}
			if (row ==0 || row ==1){
				
			
			System.out.print("\n----------------------------\n");
			}
		} 
	}
	
	
	
	public void playerTurn(){
		
		int pChoice;
	    int row = 0;
	    int column = 0;
	    
	    Scanner scan = new Scanner(System.in);
	    if (turn =='x'){
	    	System.out.print("Player one's turn: ");
	    	
	    }
	    else if(turn =='o'){
	    	System.out.print("Player two's turn: ");
	    }
	    pChoice = scan.nextInt();
	    switch(pChoice){
	    case 1: row = 0; column = 0; break;
        case 2: row = 0; column = 1; break;
        case 3: row = 0; column = 2; break;
        case 4: row = 1; column = 0; break;
        case 5: row = 1; column = 1; break;
        case 6: row = 1; column = 2; break;
        case 7: row = 2; column = 0; break;
        case 8: row = 2; column = 1; break;
        case 9: row = 2; column = 2; break;
        default:
        	System.out.print("Please enter a correct number!");
        	playerTurn();
	    }
	    
	    if (turn == 'x' && board[row][column] != 'x' && board[row][column] != 'o')
	    {
	        board[row][column] = 'x';
	        turn = 'o';
	    }
	    else if (turn == 'o' && board[row][column] != 'x' && board[row][column] != 'o')
	    {
	        board[row][column] = 'o';
	        turn = 'x';
	    }
	    else
	    {
	        System.out.print("The cell you chose is used! Try again\n");
	        playerTurn();
	    }
	}
	
	public boolean gameFinished(){
		
		//check win
		for (int i = 0; i < 3; i++)
	    {
	        if ((board[i][0] == board[i][1] && board[i][1] == board[i][2]) && board[i][0] != ' ' ||
	        	(board[0][i] == board[1][i] && board[1][i] == board[2][i]) && board[0][i] != ' ' ||
	        	(board[0][0] == board[1][1] && board[1][1] == board[2][2]) && board[0][0] != ' ' ||
	        	(board[0][2] == board[1][1] && board[1][1] == board[2][0]) && board[0][2] != ' ')
	        {
	        	
	            return true;
	            
	        }
	    }
	    
		//check draw
	    for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
	        {
	            if (board[i][j] != 'x' && board[i][j] != 'o')
	            {
	                return false;
	            }
	        }
	    }
	    draw = true;
	    return true;
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//checks empty spaces
	public boolean playerMove(char player, int row, int col){
		if (row >=0 && row <=2 && col >=0 && col <=2){
			if(board[row][col] != ' ')
				return false;
			else
			{
				board[row][col] = player;
				return true;
			}
			
		}
		else
			
		return false;
		
	}
	
	
public char getLocation(int row, int col){
		return board[row][col];
		
	}	
	
	
	
}