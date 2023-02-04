package generator;

import passangers.*;
import planes.Plane;
import rooms.Room;
import airport.Airport;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class PassengerGenerator {
	
	
    public static List<Passanger> generate(int howMany) {
        // generuje howMany pasa¿erów o ró¿nych typach z pawdopodobieñstwem 0.1-VIP
        //0.9*0.3-Business i reszte naormalny
        // brakuje œcie¿ek i odlotów;
        Random random = new Random();
        List<Passanger> ListOfPeople = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (random.nextDouble() <= 0.1) {
                ListOfPeople.add(new VIPPassanger(RouteGenerator.generate(random.nextDouble() < 0.4), 0));
            } else if (random.nextDouble() <= 0.3) {
                ListOfPeople.add(new BusinessPassanger(RouteGenerator.generate(random.nextDouble() < 0.3), 0));
            } else ListOfPeople.add(new Passanger(RouteGenerator.generate(random.nextDouble() < 0.2), 0));
        }
        return ListOfPeople;
    }
}
