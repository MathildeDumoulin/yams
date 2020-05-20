package yams_maths;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Dice de1 = new Dice();
		Dice de2 = new Dice();
		Dice de3 = new Dice();
		Dice de4 = new Dice();
		Dice de5 = new Dice();
		Figure figure = new Figure();
		boolean app = true;

		while(app){
			Scanner sc = new Scanner(System.in);
			System.out.println("Appuyez sur l+Entrée pour lancer et q+Entrée pour quitter");
			String clavier = sc.nextLine();
			String lancer = "l";
			String quitter = "q";

			if (clavier.equals(lancer)){
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
			} else if(clavier.equals(quitter)){
				sc.close();
				app=false;
			} else {
				System.out.println("Vous n'avez pas appuyé sur les bonnes touches, veuillez recommencer");
			}
		}
	}
}

