package edu.ap.eightball;

public class ReplyHazyTryAgain extends State {
	
		
	public ReplyHazyTryAgain(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Reply hazy try again");
		
	}

}
