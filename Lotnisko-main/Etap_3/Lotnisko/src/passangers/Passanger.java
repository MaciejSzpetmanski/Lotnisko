package passangers;

import airport.Airport;
import rooms.Room;

import java.util.List;

public class Passanger extends Person{

	protected List<Integer> path;
	final int odlot;
	private final int boardingOrder = 0;
	protected int waitingTime;
	protected int totalTime;
	protected Room currentRoom;
	
	public Passanger(List<Integer> path, int odlot) {
		this.path = path;

		this.odlot = odlot;
	}

	public void goNext(){
		List<Room> rooms= Airport.getAirport().get(path.get(0));
		path.remove(0);
	}
}
