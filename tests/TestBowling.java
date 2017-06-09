import static org.junit.Assert.*;

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

}
