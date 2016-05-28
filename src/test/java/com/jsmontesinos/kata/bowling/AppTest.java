package com.jsmontesinos.kata.bowling;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	
	
	@Test
	public void should_return_0_when_no_bowls_in_game(){
		App app = new App();
		int score = app.calculateScore("--------------------");
		
		assertEquals(0, score);
	}
	
	@Test
	public void should_return_10_when_one_bowl_per_turn(){
		App app = new App();
		int score = app.calculateScore("1-1-1-1-1-1-1-1-1-1-");
		
		assertEquals(10, score);
	}
	
	@Test
	public void should_return_50_when_one_and_nine_bowls(){
		App app = new App();
		int score = app.calculateScore("1-9-1-9-1-9-1-9-1-9-");
		
		assertEquals(50, score);
	}
	
	@Test
	public void should_return_80_when_five_and_three(){
		App app = new App();
		int score = app.calculateScore("53535353535353535353");
		
		assertEquals(80, score);
	}
	
	@Test
	public void should_return_100_when_empty_and_spare(){
		App app = new App();
		int score = app.calculateScore("-/-/-/-/-/-/-/-/-/-/-");
		
		assertEquals(100, score);
	}
	
	@Test
	public void should_return_300_when_all_strikes(){
		App app = new App();
		int score = app.calculateScore("XXXXXXXXXXXX");
		
		assertEquals(300, score);
	}
	
	@Test
	public void should_return_150_when_five_and_spare(){
		App app = new App();
		int score = app.calculateScore("5/5/5/5/5/5/5/5/5/5/5");
		
		assertEquals(150, score);
	}
	
	
	
	
}
