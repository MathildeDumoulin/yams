package yams_maths;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*INITIALISATION*/ 
		
		Dice de1 = new Dice();
		Dice de2 = new Dice();
		Dice de3 = new Dice();
		Dice de4 = new Dice();
		Dice de5 = new Dice();
		Figure figure = new Figure();
		boolean app = true;
		String clavier = "";
		
		
		/* L'ORDINATEUR COMMENCE */
		Player player1 = new Player("Joueur1");
		Player computer = new Player("Ordinateur");
		boolean computerTurn = false;
		
		int nbTours = 1;
		
		/*BOUCLE APP*/
		while(app){
			
			/*
			player1.victory();
			computer.defeat();
			player1.defeat();
			computer.victory();*/
			
			Scanner sc = new Scanner(System.in);
			
		
			/*SI C'EST AU JOUEUR DE JOUER, IL PEUT LANCER LES DES*/
			if(!computerTurn) {
				System.out.println("Appuyez sur l+Entrée pour lancer et q+Entrée pour quitter");
				clavier = sc.nextLine();
			}

			double parametre = Math.random()*(1);
			
			/*BOUCLE DE JEU*/
			if (clavier.equals("l") || computerTurn){
				
				/*INFORMATIONS DU TOUR*/
				System.out.println("Tour n°" + nbTours + "\n");
				if(computerTurn) {
					System.out.println("L'ordinateur joue");
				}else {
					System.out.println("Votre tour");
				}
				
				de1.lancerDice1();
				de2.lancerDice2();
				de3.lancerDice3(parametre);
				de4.lancerDice4();
				if(!computerTurn) {
					boolean choix = false;
					while(!choix){
						System.out.println("Appuyez sur [chiffre associé à la loi 1, 2, 3 ou 4]+Entrée pour sélectionner la loi suivi par le 5ème dé");
						int loi5 = sc.nextInt();
						if(loi5==1){
							de5.lancerDice1();
							sc.close();
							choix = true;
						} else if(loi5==2){
							de5.lancerDice2();
							sc.close();
							choix = true;
						} else if (loi5==3){
							de5.lancerDice3(parametre);
							sc.close();
							choix = true;
						} else if (loi5==4){
							de5.lancerDice4();
							sc.close();
							choix = true;
						} else {
							System.out.println("Les seuls chiffre associés à des lois sont 1, 2, 3 et 4 pas : " + loi5);
						}
					}
				} /*else {
					boolean choix = false;
					while(!choix){
						int loi5 = (int)Math.random()*(5-1);
						if(loi5==1){
							de5.lancerDice1();
							sc.close();
							choix = true;
						} else if(loi5==2){
							de5.lancerDice2();
							sc.close();
							choix = true;
						} else if (loi5==3){
							de5.lancerDice3(parametre);
							sc.close();
							choix = true;
						} else if (loi5==4){
							de5.lancerDice4();
							sc.close();
							choix = true;
						} else {
							System.out.println("Les seuls chiffre associés à des lois sont 1, 2, 3 et 4 pas : " + loi5);
						}
					}
				}*/
				
				
				System.out.println("Lancer des dés : " + de1.getValue() + " " + de2.getValue() + " " + de3.getValue() + " " + de4.getValue() + " " + de5.getValue());
				
				/*ON AJOUTE LES POINTS A CELUI QUI JOUE*/
				/*AFFICHAGE DES EVENTUELLES FIGURES REUSSIES*/
				if(computerTurn) {
					figure.checkFigure(de1,de2,de3,de4,de5, computer);
				}else {
					figure.checkFigure(de1,de2,de3,de4,de5, player1);
				}
				
				/*UN DES JOUEURS A COMPLETE SA FICHE, FIN DE LA PARTIE*/
				if(player1.hasCompletedSheet() || computer.hasCompletedSheet()) {
					app = false;	
				}
				
				/*ON A ATTEINT UN NOMBRE MAXIMAL DE 40 TOURS, FIN DE LA PARTIE*/
				if(nbTours == 40) {
					app = false;
				}
				
				/*A LA FIN DE CHAQUE TOUR, ON AFFICHE LA FICHE DES JOUEURS*/
				System.out.println(player1);
				System.out.println(computer);
				
				computerTurn = !computerTurn;
				
				nbTours ++;
				
			} 
			
			/*QUITTER L'APP*/
			else if(clavier.equals("q")){
				sc.close();
				app=false;
			} 
			
			else {
				System.out.println("Vous n'avez pas appuyé sur les bonnes touches, veuillez recommencer");
			}
		}
		
		if(nbTours >= 40 || player1.hasCompletedSheet() || computer.hasCompletedSheet()) {
			System.out.println("Fin de la partie ! ");
			if(player1.getScore() > computer.getScore()) {
				player1.victory();
				computer.defeat();
			}else if(player1.getScore() < computer.getScore()) {
				player1.defeat();
				computer.victory();
			}else {
				System.out.println("Egalité des scores : tous les joueurs ont un score de " + player1.getScore() + " points");
			}
		}
	
	}
}

