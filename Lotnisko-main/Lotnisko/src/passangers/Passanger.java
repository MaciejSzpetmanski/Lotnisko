package passangers;

import airport.Airport;
import planes.Plane;
import rooms.Room;

import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Passanger extends Person{

	protected List<Integer> path;
	final int[] odlot;
	private final int boardingOrder = 0;
	protected int waitingTime;
	protected int totalTime;
	protected Room currentRoom;
	protected static List<List<Room>> airport;
	protected static TreeSet<Plane> planes;
	
	public Passanger(List<Integer> path) {
		this.path = path;
		Random  random =  new Random();
		this.airport = Airport.getAirport();
		this.currentRoom = airport.get(8).get(random.nextInt(airport.get(8).size()));
		this.planes = Airport.getPlanes();
		this.odlot = planes[9];
	}

	public void goNext(){
		List<Room> rooms= airport.get(path.get(0));
		Random  random =  new Random();
		currentRoom.decreaseCapacityNow();
		if (path.get(0)!= 7){	//przechodzi do zwyk�ego pokoju
			currentRoom  = rooms.get(random.nextInt(rooms.size()));
			if (path.get(0) == 6){	//waitingRoom
				waitingTime = odlot[0]-2;
			}
			else{
				waitingTime = currentRoom.getCapacityNow()*currentRoom.getServiceTime() + Airport.getTime();
			}
			currentRoom.increaseCapacityNow();
		} 
		else{	//przechodzi do terminalu
			currentRoom = rooms.get(odlot[1]);
			waitingTime = odlot[0];
			currentRoom.increaseCapacityNow();
		}
		path.remove(0);
	}

	public int getWaitingTime() {
		return waitingTime;
	}

	public int[] getOdlot() {
		return odlot;
	}

	public Room getRoom() {
		return currentRoom;
	}
}
