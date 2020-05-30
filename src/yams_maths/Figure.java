package yams_maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Figure {

	public Figure() {
		
	}
	
	public void brelan(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5) {
		List<Integer> listeDes = new ArrayList<Integer>(5);
		
		listeDes.add(d1.getValue());
		listeDes.add(d2.getValue());
		listeDes.add(d3.getValue());
		listeDes.add(d4.getValue());
		listeDes.add(d5.getValue());
		
		Collections.sort(listeDes);
		
		if( (listeDes.get(0).equals(listeDes.get(1)) && listeDes.get(1).equals(listeDes.get(2)))
				||(listeDes.get(1).equals(listeDes.get(2)) && listeDes.get(2).equals(listeDes.get(3)))
				||(listeDes.get(2).equals(listeDes.get(3)) && listeDes.get(3).equals(listeDes.get(4)))){
			System.out.println("BRELAN");
			//return listeDes.get(0) + listeDes.get(1) + listeDes.get(2) + listeDes.get(3) + listeDes.get(4) ;
		}
		//return 0;
	}
	
	public void carre(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5) {
		List<Integer> listeDes = new ArrayList<Integer>(5);
		
		listeDes.add(d1.getValue());
		listeDes.add(d2.getValue());
		listeDes.add(d3.getValue());
		listeDes.add(d4.getValue());
		listeDes.add(d5.getValue());
		
		Collections.sort(listeDes);
		
		if((listeDes.get(0).equals(listeDes.get(1)) && listeDes.get(1).equals(listeDes.get(2)) && listeDes.get(2).equals(listeDes.get(3)))
				|| (listeDes.get(1).equals(listeDes.get(2)) && listeDes.get(2).equals(listeDes.get(3)) && listeDes.get(3).equals(listeDes.get(4)))
				){
			System.out.println("CARRE");
			//return listeDes.get(0) + listeDes.get(1) + listeDes.get(2) + listeDes.get(3) + listeDes.get(4) ;
		}
		//return 0;
	}
	
	public void full(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5) {
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
			//return 25;
		}
		//return 0;
	}
	
	public void suite(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5) {
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
			//return 40:
		}
		// return 0;
	}
	
	public void yams(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5) {
		List<Integer> listeDes = new ArrayList<Integer>(5);
		
		listeDes.add(d1.getValue());
		listeDes.add(d2.getValue());
		listeDes.add(d3.getValue());
		listeDes.add(d4.getValue());
		listeDes.add(d5.getValue());
		
		Collections.sort(listeDes);
		
		if((listeDes.get(0).equals(listeDes.get(1)) && listeDes.get(1).equals(listeDes.get(2)) && listeDes.get(2).equals(listeDes.get(3)) && listeDes.get(3).equals(listeDes.get(4)))){
			System.out.println("YAMS");
			//return 50;
		}
		//return 0;
	}
	
}
