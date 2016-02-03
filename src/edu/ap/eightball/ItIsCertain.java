package edu.ap.eightball;

public class ItIsCertain extends State {
	
		
	public ItIsCertain(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("It is certain");
		
	}

}
