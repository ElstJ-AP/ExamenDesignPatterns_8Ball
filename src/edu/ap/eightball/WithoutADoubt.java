package edu.ap.eightball;

public class WithoutADoubt extends State {
	
		
	public WithoutADoubt(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Without a doubt");
		
	}

}
