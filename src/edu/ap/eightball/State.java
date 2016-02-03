package edu.ap.eightball;

import java.util.ArrayList;
import java.util.Random;

public abstract class State {
	
	protected EightBall ball;
	
	public abstract void answer();
	
	public void ask(String question){
		System.out.println(question);
		ArrayList<State> list = ball.getAllStates();
		Random rand = ball.getRandom();
		int randomInt = rand.nextInt(ball.getAnswerAmount());
		State nextState = list.get(randomInt);
		ball.setCurrentState(nextState);
	}

}
