package passangers;

import rooms.Room;

import java.util.List;

public class BusinessPassanger extends Passanger{

	private final int boardingOrder = 1;

    public BusinessPassanger(List<Room> myPath, int odlot) {
        super(myPath, odlot);
    }
}
