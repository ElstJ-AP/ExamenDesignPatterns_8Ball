package edu.ap.eightball;

public class Yes extends State {
	
		
	public Yes(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Yes");
		
	}

}
