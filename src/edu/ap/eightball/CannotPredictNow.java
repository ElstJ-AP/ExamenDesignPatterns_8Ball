package edu.ap.eightball;

public class CannotPredictNow extends State {
	
		
	public CannotPredictNow(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Cannot predict now");
		
	}

}
