import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 21:00
// Student ID: IT15-2015

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
	
	
	public void dodajSpareStrikeBonus(){
		
		for(int i = 0; i < frames.size(); i++){
			if(frames.get(i).isSpare() && i != frames.size() - 1){
				frames.get(i).addBonus(frames.get(i+1).getFirstThrow());
			}else if(frames.get(i).isStrike() && i != frames.size() - 1){
				frames.get(i).addBonus(frames.get(i+1).getFirstThrow() + frames.get(i+1).getSecondThrow());
			}
		}
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		dodajSpareStrikeBonus();
		for(int i=0; i < frames.size(); i++)
		{
			s = s + frames.get(i).score();
		}
		
	}

	
	// Returns the game score
	public int score(){
		
		for(int i=0; i<frames.size(); i++){
			s = s + frames.get(i).score();
		}
		//to be implemented: should return game score 
		return s;
	}
	
}
