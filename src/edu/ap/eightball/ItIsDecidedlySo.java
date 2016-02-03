package edu.ap.eightball;

public class ItIsDecidedlySo extends State {
	
		
	public ItIsDecidedlySo(EightBall ball){
		this.ball = ball;
	}

	@Override
	public void answer() {
		System.out.println("It is decidedly so");
		
	}

}
