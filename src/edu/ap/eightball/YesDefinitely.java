package edu.ap.eightball;

public class YesDefinitely extends State {
	
		
	public YesDefinitely(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Yes, definitely");
		
	}

}
