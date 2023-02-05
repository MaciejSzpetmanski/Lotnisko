package generator;

import airport.Airport;
import passangers.BusinessPassanger;
import passangers.Passanger;
import passangers.VIPPassanger;
import planes.Plane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PassengerGenerator {
	
	
    public static List<Passanger> generate(int howMany) {
        // generuje howMany pasa�er�w o r�nych typach z pawdopodobie�stwem 0.1-VIP
        //0.9*0.3-Business i reszte naormalny
        // brakuje �cie�ek i odlot�w;
        Random random = new Random();
        List<Plane> planes = new ArrayList<>(Airport.getPlanes());
        List<Passanger> ListOfPeople = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (random.nextDouble() <= 0.1) {
                ListOfPeople.add(new VIPPassanger(RouteGenerator.generate(random.nextDouble() < 0.4), planes.get(random.nextInt(planes.size()))));
            } else if (random.nextDouble() <= 0.3) {
                ListOfPeople.add(new BusinessPassanger(RouteGenerator.generate(random.nextDouble() < 0.3), planes.get(random.nextInt(planes.size()))));
            } else ListOfPeople.add(new Passanger(RouteGenerator.generate(random.nextDouble() < 0.2), planes.get(random.nextInt(planes.size()))));
        }
        return ListOfPeople;
    }
}
