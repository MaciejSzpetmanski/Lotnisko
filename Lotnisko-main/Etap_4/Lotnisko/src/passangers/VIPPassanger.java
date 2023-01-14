package passangers;

import java.util.List;

public class VIPPassanger extends Passanger{

	private final int boardingOrder = 2;

	public VIPPassanger(List<Integer> myPath, int odlot) {
		super(myPath, odlot);
	}
}