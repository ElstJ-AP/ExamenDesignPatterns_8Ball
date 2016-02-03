package edu.ap.eightball;

public class ConcentrateAndAskAgain extends State {
	
		
	public ConcentrateAndAskAgain(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Concentrate and ask again");
		
	}

}
