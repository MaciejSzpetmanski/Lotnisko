package passangers;

import airport.Airport;
import planes.Plane;
import rooms.Room;

import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Passanger extends Person{

	protected List<Integer> path;
	final Plane odlot;
	private final int boardingOrder = 0;
	protected int waitingTime;
	protected int totalTime;
	protected Room currentRoom;
	protected static List<List<Room>> airport;
	protected static TreeSet<Plane> planes;
	
	public Passanger(List<Integer> path, Plane odlot) {
		this.path = path;
		Random  random =  new Random();
		this.airport = Airport.getAirport();
		this.currentRoom = airport.get(8).get(random.nextInt(airport.get(8).size()));
		this.planes = Airport.getPlanes();
		this.odlot = odlot;
	}

	public void goNext(){
		List<Room> rooms= airport.get(path.get(0));
		Random  random =  new Random();
		currentRoom.decreaseCapacityNow();
		if (path.get(0)!= 7){	//przechodzi do zwyk³ego pokoju
			currentRoom  = rooms.get((rooms.size()>0)?random.nextInt(rooms.size()):0);
			if (path.get(0) == 6){	//waitingRoom
				waitingTime = odlot.getOdlot()-2;
			}
			else{
				waitingTime = currentRoom.getCapacityNow()*currentRoom.getServiceTime() + Airport.getTime();
			}
			currentRoom.increaseCapacityNow();
		} 
		else{	//przechodzi do terminalu
			currentRoom = rooms.get(odlot.getTerminal());
			waitingTime = 181;
			currentRoom.increaseCapacityNow();
		}
		path.remove(0);
	}

	public int getWaitingTime() {
		return waitingTime;
	}

	public Plane getOdlot() {
		return odlot;
	}

	public Room getRoom() {
		return currentRoom;
	}
}
