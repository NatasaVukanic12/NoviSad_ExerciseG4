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
	
	

}
