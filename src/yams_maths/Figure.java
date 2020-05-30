package yams_maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Figure {

	public Figure() {
		
	}
	
	public void checkFigure(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5, Player p) {
		/*SI ON EFFECTUE UNE COMBINAISON PENDANT LE TOUR, ON NE PEUT PAS EN FAIRE UNE DEUXIEME*/
		int initialScore = p.getScore();
		if(!p.getYams())
			yams(d1, d2, d3, d4, d5, p);
		
		if(!p.getFull() && p.getScore() == initialScore) 
			full(d1, d2, d3, d4, d5, p);
		if(!p.getSuite() && p.getScore() == initialScore) 
			suite(d1, d2, d3, d4, d5, p);
		if(!p.getCarre() && p.getScore() == initialScore) 
			carre(d1, d2, d3, d4, d5, p);
		if(!p.getBrelan() && p.getScore() == initialScore) 
			brelan(d1, d2, d3, d4, d5, p);
		//else System.out.println("Aucune nouvelle figure obtenue");
	}
	
	public void brelan(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5, Player p) {
		List<Integer> listeDes = new ArrayList<Integer>(5);
		
		listeDes.add(d1.getValue());
		listeDes.add(d2.getValue());
		listeDes.add(d3.getValue());
		listeDes.add(d4.getValue());
		listeDes.add(d5.getValue());
		
		Collections.sort(listeDes);
		
		/*CHECKING FIGURE*/
		int sit = -1;
		if ((listeDes.get(0).equals(listeDes.get(1)) && listeDes.get(1).equals(listeDes.get(2)))) sit = 0;
		else if((listeDes.get(1).equals(listeDes.get(2)) && listeDes.get(2).equals(listeDes.get(3)))) sit = 1;
		else if (listeDes.get(2).equals(listeDes.get(3)) && listeDes.get(3).equals(listeDes.get(4))) sit = 2;
			
		/*ADDING POINTS TO THE PLAYER IF WE GOT THE FIGURE*/
		if(sit != -1) {
			System.out.println("BRELAN");
			p.validateBrelan(listeDes.get(sit)*3);
		}
	}
	
	public void carre(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5, Player p) {
		List<Integer> listeDes = new ArrayList<Integer>(5);
		
		listeDes.add(d1.getValue());
		listeDes.add(d2.getValue());
		listeDes.add(d3.getValue());
		listeDes.add(d4.getValue());
		listeDes.add(d5.getValue());
		
		Collections.sort(listeDes);
		
		int sit = -1;
		if ((listeDes.get(0).equals(listeDes.get(1)) && listeDes.get(1).equals(listeDes.get(2)) && listeDes.get(2).equals(listeDes.get(3)))) sit = 0;
		if (listeDes.get(1).equals(listeDes.get(2)) && listeDes.get(2).equals(listeDes.get(3)) && listeDes.get(3).equals(listeDes.get(4))) sit = 1;
		
		if(sit != -1) {
			System.out.println("CARRE");
			p.validateCarre(listeDes.get(sit)*4);
		}
			
	}
	
	public void full(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5, Player p) {
		List<Integer> listeDes = new ArrayList<Integer>(5);
		
		listeDes.add(d1.getValue());
		listeDes.add(d2.getValue());
		listeDes.add(d3.getValue());
		listeDes.add(d4.getValue());
		listeDes.add(d5.getValue());
		
		Collections.sort(listeDes);
		
		if((listeDes.get(0).equals(listeDes.get(1)) && listeDes.get(2).equals(listeDes.get(3)) && listeDes.get(3).equals(listeDes.get(4)))
				|| (listeDes.get(0).equals(listeDes.get(1)) && listeDes.get(1).equals(listeDes.get(2)) && listeDes.get(3).equals(listeDes.get(4)))
				){
			System.out.println("FULL");
			p.validateFull(25);
		}
	}
	
	public void suite(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5, Player p) {
		List<Integer> listeDes = new ArrayList<Integer>(5);
		
		listeDes.add(d1.getValue());
		listeDes.add(d2.getValue());
		listeDes.add(d3.getValue());
		listeDes.add(d4.getValue());
		listeDes.add(d5.getValue());
		
		Collections.sort(listeDes);
		
		if((listeDes.get(0).equals(1) && listeDes.get(1).equals(2) && listeDes.get(2).equals(3) && listeDes.get(3).equals(4) && listeDes.get(4).equals(5))
				||(listeDes.get(0).equals(2) && listeDes.get(1).equals(3) && listeDes.get(2).equals(4) && listeDes.get(3).equals(5) && listeDes.get(4).equals(6))
				){
			System.out.println("SUITE");
			p.validateSuite(40);
		}
	}
	
	public void yams(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5, Player p) {
		List<Integer> listeDes = new ArrayList<Integer>(5);
		
		listeDes.add(d1.getValue());
		listeDes.add(d2.getValue());
		listeDes.add(d3.getValue());
		listeDes.add(d4.getValue());
		listeDes.add(d5.getValue());
		
		Collections.sort(listeDes);
		
		if((listeDes.get(0).equals(listeDes.get(1)) && listeDes.get(1).equals(listeDes.get(2)) && listeDes.get(2).equals(listeDes.get(3)) && listeDes.get(3).equals(listeDes.get(4)))){
			System.out.println("YAMS");
			p.validateYams(50);
		}
	}
	
}
