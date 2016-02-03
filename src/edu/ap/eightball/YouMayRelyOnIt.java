package edu.ap.eightball;

public class YouMayRelyOnIt extends State {
	
		
	public YouMayRelyOnIt(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("You may rely on it");
		
	}

}
