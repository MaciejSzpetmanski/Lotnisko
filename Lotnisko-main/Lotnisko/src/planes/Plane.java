package planes;

import java.util.List;

import airport.Airport;
import passangers.Passanger;
import rooms.Terminal;

public class Plane implements Comparable<Plane>{

	private int terminal;
	private int odlot;
	
	public Plane(int odlot, int terminal) {
		
		this.odlot = odlot;
		this.terminal = terminal;
		
	}

	public int compareTo(Plane p)
    {
        return ((Integer)this.odlot).compareTo(((Integer)p.odlot));
    }

	public int getOdlot() {
		return odlot;
	}

	public void takeOff(){
		List<Passanger> passengers = Airport.getPassengers();
		for (Passanger p: passengers){
            if(p.getRoom() instanceof Terminal){
				int[] pOdlot = p.getOdlot();
                if(pOdlot[0]==odlot & pOdlot[1]== terminal){
					passengers.remove(p);	//pasa¿er odlatuje z lotniska
				}
                
            }
        }

	}
	
	public int[] getPlane() {
		int[] 
	}
	
}
