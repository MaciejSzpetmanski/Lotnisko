package generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import planes.Plane;

public class PlanesGenerator {

	 public static HashSet<Plane> generate(int howMany) {
	        Random random = new Random();
	        HashSet<Plane> SetOfPlanes = new HashSet<>();
	        for (int i = 0; i < howMany; i++) {
	            if (random.nextDouble() <= 0.33) {
	            	SetOfPlanes.add(new Plane(random.nextInt(170)+10, 0));
	            } else if (random.nextDouble() <= 0.66) {
	            	SetOfPlanes.add(new Plane(random.nextInt(170)+10, 1));
	            } else SetOfPlanes.add(new Plane(random.nextInt(170)+10, 2));
	        }
	        return SetOfPlanes;
	    }
	 
	 
	
}
