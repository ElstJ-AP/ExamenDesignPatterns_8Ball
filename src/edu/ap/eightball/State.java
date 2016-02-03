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
		State nextState;
		
		do{
		int randomInt = rand.nextInt(ball.getAnswerAmount());
		nextState = list.get(randomInt);
		
		}while(alreadyAsked(nextState));
		
		ball.setCurrentState(nextState);
		ball.setPastAnswer(nextState, ball.getCounter());
	}
	
	public boolean alreadyAsked(State state){
		State[] pastAnswers = ball.getPastAnswers();
		for(int i = 0; i < pastAnswers.length; i++){
			if(pastAnswers[i] == state){
				return true;
			}
		}
		return false;
	}

}
