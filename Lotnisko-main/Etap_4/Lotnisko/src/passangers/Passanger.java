package passangers;

import airport.Airport;
import rooms.Room;

import java.util.List;
import java.util.Random;

public class Passanger extends Person{

	protected List<Integer> path;
	final int odlot;
	private final int boardingOrder = 0;
	protected int waitingTime;
	protected int totalTime;
	protected Room currentRoom;
	protected static List<List<Room>> airport;
	
	public Passanger(List<Integer> path, int odlot) {
		this.path = path;
		Random  random =  new Random();
		this.airport = Airport.getAirport();
		this.currentRoom = airport.get(8).get(random.nextInt(airport.get(8).size()));
		this.odlot = odlot;
	}

	public void goNext(){
		List<Room> rooms= airport.get(path.get(0));
		path.remove(0);
		Random  random =  new Random();
		currentRoom.decreaseCapacityNow();
		currentRoom  = rooms.get(random.nextInt(rooms.size()));
		waitingTime = currentRoom.getCapacityNow()*currentRoom.getServiceTime() + Airport.getTime();
		currentRoom.increaseCapacityNow();
	}

	public int getWaitingTime() {
		return waitingTime;
	}
}
