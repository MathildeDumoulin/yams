package yams_maths;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world");
		Dice de1 = new Dice();
		System.out.println("init de1 = "+ de1.getValue());
		de1.lancerDice();
		System.out.println("lancer de1 = "+ de1.getValue());
	}
}
