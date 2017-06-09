import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	private int s=0;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
	}
	
	public void DodajSpareBonus() throws BowlingException{
		
		for(int i=0; i<frames.size(); i++){
			if((frames.get(i).getFirstThrow() + frames.get(i).getSecondThrow()) == 10 && i != frames.size()){
				s = frames.get(i).getFirstThrow() + frames.get(i).getSecondThrow() + frames.get(i+1).getFirstThrow();
			
			}
			else{
				throw new BowlingException();
			}
			
		}
		
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}

	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		return 0;
	}
}
