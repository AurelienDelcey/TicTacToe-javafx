package ticTacToe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ticTacToe.Model.ButtonState;
import ticTacToe.Model.Grid;

class GridTest {
	
	private Grid gridToTest;
	private static final int GRID_SIZE = 3;
	
	@BeforeEach
	void setup() {
		this.gridToTest = new Grid(GRID_SIZE);
	}

	@Test
	void init_ShouldFillGridWithEmptyButtons() {
		fillGrid();
		gridToTest.init();
		for(int i=0; i<GRID_SIZE; i++) {
			for(int j=0; j<GRID_SIZE; j++) {
				assertEquals(ButtonState.EMPTY,gridToTest.get(i, j));
			}
		}
	}
	
	@Test
	void isFull_ReturnTrue_WhenGridIsFull() {
		fillGrid();
		assertTrue(gridToTest.isFull());
	}
	
	@Test
	void isFull_ReturnFalse_WhenGridIsEmpty() {
		assertFalse(gridToTest.isFull());
	}
	
	@Test
	void isFull_ReturnFalse_WhenAtLeastOneCellIsEmpty() {
		fillGrid();
		gridToTest.set(1, 1, ButtonState.EMPTY);
		assertFalse(gridToTest.isFull());
	}
	
	@Test
	void set_ShouldChangeCellState(){
		gridToTest.set(0, 0, ButtonState.CROSS);
		assertEquals(ButtonState.CROSS, gridToTest.get(0, 0));
	}
	
	@Test
	void size_ShouldReturnGridSize() {
		assertEquals(GRID_SIZE, gridToTest.size());
	}
	
	private void fillGrid() {
		for(int i=0; i<GRID_SIZE; i++) {
			for(int j=0; j<GRID_SIZE; j++) {
				gridToTest.set(i, j, ButtonState.CIRCLE);
			}
		}
	}

}
