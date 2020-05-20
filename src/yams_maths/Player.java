package yams_maths;

public class Player {
	private boolean brelan = false;
	private boolean carre = false;
	private boolean full = false;
	private boolean suite = false;
	private boolean yams = false;
	private int score;
	
	public Player() {
		this.score = 0;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void validateBrelan(int points){
		this.brelan = true;
		this.score += points;
	}
	
	public void validateCarre(int points){
		this.carre = true;
		this.score += points;
	}
	
	public void validateFull(int points){
		this.full = true;
		this.score += points;
	}
	
	public void validateSuite(int points){
		this.suite = true;
		this.score += points;
	}
	
	public void validateYams(int points){
		this.yams = true;
		this.score += points;
	}
	
	public boolean hasCompletedSheet() {
		return(brelan && carre && full && suite && yams);
	}
}
