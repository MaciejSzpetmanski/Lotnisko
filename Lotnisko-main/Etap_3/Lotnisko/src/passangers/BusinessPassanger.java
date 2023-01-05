package passangers;

import java.util.List;

public class BusinessPassanger extends Passanger{

	private final int boardingOrder = 1;

    public BusinessPassanger(List<Integer> myPath, int odlot) {
        super(myPath, odlot);
    }
}
