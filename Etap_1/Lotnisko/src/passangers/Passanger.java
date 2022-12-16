package passangers;

import java.util.List;

public class Passanger extends Person{

	private final List<Room> myPath;
	private final int odlot;
	private final int boardingOrder = 0;
	protected int czasOczekiwania;
	protected int totalTime;
	
	public Passanger() {
		
	}
}
