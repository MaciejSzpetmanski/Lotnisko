package passangers;

import rooms.Room;

import java.util.List;

public class Passanger extends Person{

	final List<Room> myPath;
	final int odlot;
	private final int boardingOrder = 0;
	protected int czasOczekiwania;
	protected int totalTime;
	
	public Passanger(List<Room> myPath, int odlot) {
		this.myPath = myPath;

		this.odlot = odlot;
	}
}
