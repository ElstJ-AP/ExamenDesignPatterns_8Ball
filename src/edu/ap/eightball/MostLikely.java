package edu.ap.eightball;

public class MostLikely extends State {
	
		
	public MostLikely(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Most Likely");
		
	}

}
