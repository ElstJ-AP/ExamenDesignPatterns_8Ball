package edu.ap.eightball;

public class SignsPointToYes extends State {
	
		
	public SignsPointToYes(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Signs point to yes");
		
	}

}
