package edu.ap.eightball;

public class BetterNotTellYouNow extends State {
	
		
	public BetterNotTellYouNow(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Better not tell you now");
		
	}

}
