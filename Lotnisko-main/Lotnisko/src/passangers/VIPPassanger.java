package passangers;

import planes.Plane;

import java.util.List;

public class VIPPassanger extends Passanger{

	private final int boardingOrder = 2;

	public VIPPassanger(List<Integer> myPath, Plane odlot) {
		super(myPath, odlot);
	}
}