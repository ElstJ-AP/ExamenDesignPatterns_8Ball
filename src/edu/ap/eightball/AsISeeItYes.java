package edu.ap.eightball;

public class AsISeeItYes extends State {
	
		
	public AsISeeItYes(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("As I see it, yes");
		
	}

}
