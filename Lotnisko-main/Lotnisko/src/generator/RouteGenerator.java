package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RouteGenerator {

    public static List<Integer> generate(boolean baggage) {
        //generowanie bêdzie siê odbycwaæ po indeksach rodzajów pokoi:
        //chceckIn - 0
        //Security - 1
        //BaggageCheckIn - 2
        //BaggageDrop - 3
        //PassportControll - 4
        //Shop -12,13 - 5
        //WaitingRoom - 6
        //Terminal - 7
        List<Integer> route = new ArrayList<>();
        Random random = new Random();
        route.add(0); // checkIn, VIP
        if (baggage) {
            route.add(2);       // BaggageCheckIn
            route.add(3);       // BaggageDrop
        }
        
        route.add(1); //Security, VIP
        if (random.nextDouble() < 0.1) {
            route.add(4); //PassportControll
        }
        if (random.nextDouble() < 0.6) {
            route.add(5); // Shop
        }
        route.add(6); //waitingRoom
        route.add(7); //terminal

        return route;
    }
}
