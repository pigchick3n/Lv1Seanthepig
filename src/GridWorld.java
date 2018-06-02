import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World w = new World();
		Bug b1 = new Bug();
		Bug b2 = new Bug();
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		
		int j = 10;
		Location l1 = new Location(5,5);
		Location l2 = new Location(5,4);
		Location l3 = new Location(5,6);
		Random r = new Random(10);
		Random r2 = new Random(10);
		w.show();
		
		
		b1.setColor(Color.BLUE);
		b1.canMove();
		b1.turn();
		b1.turn();
		for (int j1 = 0; j1 < 10; j1++) {
			
		
		for (int i = 0; i < 10; i++) {
			j--;
			Location i1 = new Location(j1,i);
			
			if(i%2 == 0) {
				w.add(i1, b1);
				b1.setColor(Color.BLUE);
			}else {
				w.add(i1, b2);
				b2.setColor(Color.RED);
			}
	
		}
		}
		}
	}



