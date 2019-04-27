package w21day1;

import java.util.ArrayList;

import apcs.Window;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Organism> organisms = new ArrayList<Organism>();
		
		int planktons = 1;
		for(int i =0; i<planktons; i++) {
			organisms.add(new Plankton());
		}

		for(int i = 0; i<30; i++) {
			organisms.add(new Fish());
		}
		
		for(int i = 0; i<=3; i++) {
			organisms.add(new Whale());
		}
		
		int planktonDead = 0;
		
		while(true) {
			Window.frame();
			for(Organism o: organisms) {
				o.move();
				
				
				if (o instanceof Whale) {
					for(Organism p: organisms) {

						if (planktonDead == planktons) {
							System.out.println("hello");
							if (p instanceof Fish && o.getDistance(p)<=((Whale)o).height&&p.alive){
								(o).eat(p);
							}
						}else if (p instanceof Plankton && o.getDistance(p)<=((Whale)o).height&&p.alive){
							(o).eat(p);
							planktonDead+=1;
							System.out.println("hi");
						}
					}
				}
				if (o instanceof Fish) {
					for(Organism p: organisms) {
						if (p instanceof Plankton && o.getDistance(p)<=((Fish)o).height&&p.alive){
							(o).eat(p);
						}
					}
				}
				
			}
		}
		
		

	}

}