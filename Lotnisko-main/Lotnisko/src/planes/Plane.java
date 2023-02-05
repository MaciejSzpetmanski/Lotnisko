package planes;

import airport.Airport;
import passangers.Passanger;
import rooms.Terminal;

import java.util.List;

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

	public int getTerminal() {
		return terminal;
	}

	public void takeOff(){
		List<Passanger> passengers = Airport.getPassengers();
		for (Passanger p: passengers){
            if(p.getRoom() instanceof Terminal){
				Plane pOdlot = p.getOdlot();
                if(pOdlot.getOdlot()==odlot & pOdlot.getTerminal()==terminal){
					passengers.remove(p);	//pasa�er odlatuje z lotniska
				}
                
            }
        }

	}
	
	//public int[] getPlane() {
		//int[]
	//}
	
}
