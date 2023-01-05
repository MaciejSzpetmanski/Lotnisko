package passangers;

import rooms.Room;

import java.util.List;

public class VIPPassanger extends Passanger{

	private final int boardingOrder = 2;

	public VIPPassanger(List<Room> myPath, int odlot) {
		super(myPath, odlot);
	}
}