package assignment3;

public class Happy extends Moody {

	protected String getMood() {
		return "I feel happy today!";
	}
	
	public void expressFeelings() {
		System.out.println("hehehe...hahaha...HAHAHAHAHA!!!");
	}
	
	public String toString() {
		return "Observation: Subject laughs a lot";
	}
	
}
