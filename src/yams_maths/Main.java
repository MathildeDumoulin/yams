package yams_maths;

public class Main {
	public static void main(String[] args) {
		Dice de1 = new Dice();
		Dice de2 = new Dice();
		Dice de3 = new Dice();
		Dice de4 = new Dice();
		Dice de5 = new Dice();
		Figure figure = new Figure();
		
		de1.lancerDice();
		de2.lancerDice();
		de3.lancerDice();
		de4.lancerDice();
		de5.lancerDice();
		
		System.out.println("Lancer des dés : " + de1.getValue() + " " + de2.getValue() + " " + de3.getValue() + " " + de4.getValue() + " " + de5.getValue());
		figure.brelan(de1, de2, de3, de4, de5);
		figure.carre(de1, de2, de3, de4, de5);
		figure.suite(de1, de2, de3, de4, de5);
		figure.full(de1, de2, de3, de4, de5);
		figure.yams(de1, de2, de3, de4, de5);
		
	}
}

