package yams_maths;

import java.util.Objects;

public class Player {
	private boolean brelan = false;
	private boolean carre = false;
	private boolean full = false;
	private boolean suite = false;
	private boolean yams = false;
	private int score;
	private final String name;
	
	private int scoreBrelan = 0;
	private int scoreCarre = 0;
	
	public Player(String name) {
		this.score = 0;
		this.name = Objects.requireNonNull(name, "Le nom du joueur ne peut etre null");
	}
	
	/*GETTERS*/
	
	public int getScore() {
		return this.score;
	}
	
	public boolean getBrelan() {
		return this.brelan;
	}
	public boolean getCarre() {
		return this.carre;
	}
	public boolean getFull() {
		return this.full;
	}
	public boolean getSuite() {
		return this.suite;
	}
	public boolean getYams() {
		return this.yams;
	}
	
	
	/*VALIDATING POINTS*/
	public void validateBrelan(int points){
		this.brelan = true;
		this.score += points;
		this.scoreBrelan = points;
	}
	
	public void validateCarre(int points){
		this.carre = true;
		this.score += points;
		this.scoreCarre = points;
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
	
	public void victory() {
		System.out.println(this.name + " remporte la partie avec " + score + " points \n");
	}
	public void defeat() {
		System.out.println(this.name + " perd la partie avec " + score + " points \n");
	}
	
	@Override 
	public String toString() {
		StringBuilder strb = new StringBuilder();
		
		strb.append(name).append("\n");
		
		if (brelan) strb.append("Brelan : ").append(scoreBrelan).append(" pts \n");
		else strb.append("Brelan : ___ \n");
		
		if (carre) strb.append("Carré : ").append(scoreCarre).append(" pts \n");
		else strb.append("Carre : ___ \n");
		
		if (full) strb.append("Full : 25 pts \n");
		else strb.append("Full : ___ \n");
		
		if (suite) strb.append("Suite : 40 pts \n");
		else strb.append("Suite : ___ \n");
		
		if (yams) strb.append("Yams: 50pts \n");
		else strb.append("Yams : ___ \n");
		
		strb.append("Score actuel : ").append(score).append("\n");
		
		return strb.toString();
	}
}
