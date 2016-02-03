package edu.ap.eightball;

import java.util.ArrayList;
import java.util.Random;

public class EightBall {
	
	private State itIsCertainState;
	private State itIsDecidedlySoState;
	private State withoutADoubtState;
	private State yesDefinitelyState;
	private State youMayRelyOnItState;
	private State asISeeItYesState;
	private State mostLikelyState;
	private State outlookGoodState;
	private State yesState;
	private State signsPointToYesState;
	private State replyHazyTryAgainState;
	private State askAgainLaterState;
	private State betterNotTellYouNowState;
	private State cannotPredictNowState;
	private State concentrateAndAskAgainState;
	
	private State currentState;
	private Random random;
	private int answerAmount;
	private State[] pastAnswers;
	private int counter;
	
	private static EightBall uniqueInstance = new EightBall();
	
	private EightBall(){
		random = new Random();
		answerAmount = 15;
		pastAnswers = new State[10];
		counter = 0;
		
		itIsCertainState = new ItIsCertain(this);
		itIsDecidedlySoState = new ItIsDecidedlySo(this);
		withoutADoubtState = new WithoutADoubt(this);
		yesDefinitelyState = new YesDefinitely(this);
		youMayRelyOnItState = new YouMayRelyOnIt(this);
		asISeeItYesState = new AsISeeItYes(this);
		mostLikelyState = new MostLikely(this);
		outlookGoodState = new OutlookGood(this);
		yesState = new Yes(this);
		signsPointToYesState = new SignsPointToYes(this);
		replyHazyTryAgainState = new ReplyHazyTryAgain(this);
		askAgainLaterState = new AskAgainLater(this);
		betterNotTellYouNowState = new BetterNotTellYouNow(this);
		cannotPredictNowState = new CannotPredictNow(this);
		concentrateAndAskAgainState = new ConcentrateAndAskAgain(this);
		
		currentState = yesState;
		
	}
	
	public static EightBall getInstance(){
		return uniqueInstance;				
	}
	
	public ArrayList<State> getAllStates(){
		ArrayList<State> list = new ArrayList<State>();
		list.add(itIsCertainState);
		list.add(itIsDecidedlySoState);
		list.add(withoutADoubtState);
		list.add(yesDefinitelyState);
		list.add(youMayRelyOnItState);
		list.add(asISeeItYesState);
		list.add(mostLikelyState);
		list.add(outlookGoodState);
		list.add(yesState);
		list.add(signsPointToYesState);
		list.add(replyHazyTryAgainState);
		list.add(askAgainLaterState);
		list.add(betterNotTellYouNowState);
		list.add(cannotPredictNowState);
		list.add(concentrateAndAskAgainState);
		return list;
	}
	
	public Random getRandom(){
		return random;
	}
	
	public int getAnswerAmount(){
		return answerAmount;
	}
	
	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public State[] getPastAnswers(){
		return pastAnswers;
	}
	
	public void setPastAnswer(State state, int index){
		pastAnswers[index] = state;
		counter++;
		if(counter > 9){
			counter = 0;
		}
	}
	
	public int getCounter(){
		return counter;
	}
	

	public void ask(String question) {
    	getCurrentState().ask(question);
    	answer();
    }

    public void answer() {
    	getCurrentState().answer();
    }

}
