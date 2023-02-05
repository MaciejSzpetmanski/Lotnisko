package passangers;

import planes.Plane;

import java.util.List;

public class BusinessPassanger extends Passanger{

	private final int boardingOrder = 1;

    public BusinessPassanger(List<Integer> myPath, Plane odlot) {
        super(myPath, odlot);
    }
}
