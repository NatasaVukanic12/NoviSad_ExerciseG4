import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestBowling {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void test_Score(){
		Frame frame = new Frame(3,5);
		assertEquals(8,frame.score());
	}
	
	@Test
	public void test_Spare(){
		Frame frame = new Frame(5,5);
		assertTrue(frame.isSpare());
	}
	
	@Test
	public void test_Strike(){
		Frame frame = new Frame(10, 0);
		assertTrue(frame.isStrike());
	}
	
	@Test
	public void test_DodajBonusNaFrameSpare(){
		
		BowlingGame game = new BowlingGame();
		Frame f1 = new Frame(5,5);
		Frame f2 = new Frame(2,5);
		game.addFrame(f1);
		game.addFrame(f2);		
		assertEquals(19, game.DodajSpareBonus());
	}
	

}
