package edu.ap.eightball;

public class OutlookGood extends State {
	
		
	public OutlookGood(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("Outlook good");
		
	}

}
