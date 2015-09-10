package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	@Test
	public void testInitialBoardIsEmpty() {
		TicTacToe testBoard = new TicTacToe();
		boolean isFull = false;
		for (int i = 0; i<3;i++){
			for(int j = 0; j<3;j++){
				if(testBoard.board[i][j] == ' '){
					isFull=true;
				}
			}
		}
		
		assertTrue(isFull);
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		TicTacToe testX = new TicTacToe();
		testX.playerMove('x', 0, 2);
		assertEquals('x',testX.getLocation(0,2));
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		TicTacToe testO = new TicTacToe();
		testO.playerMove('o', 2, 0);
		assertEquals('o',testO.getLocation(2,0));
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
        TicTacToe testX = new TicTacToe();
		testX.playerMove('x', 0, 2);
        testX.playerMove('o', 0, 2);
		assertEquals('x',testX.getLocation(0,2));
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
       
        
		assertTrue(false);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		assertTrue(false);
	}	
}
