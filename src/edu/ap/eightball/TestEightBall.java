package edu.ap.eightball;

public class TestEightBall {

	public static void main(String[] args) {
		
		EightBall ball = EightBall.getInstance();
		for(int i = 0; i<25; i++){
			ball.ask("Will I pass this exam?");
			System.out.println();
		}

	}

}
