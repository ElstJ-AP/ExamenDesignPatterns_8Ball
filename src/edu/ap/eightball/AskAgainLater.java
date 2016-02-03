package edu.ap.eightball;

public class AskAgainLater extends State {
	
		
	public AskAgainLater(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Ask again later");
		
	}

}
