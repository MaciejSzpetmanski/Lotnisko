package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RouteGenerator {

    public static List<Integer> generate(boolean VIP, boolean baggage){
        //losowanie będzie się odbywać po indeksach pokoii:
        //chceckIn - 0-3, 3 to VIP
        //Security - 4-7, 7 to VIP
        //BaggageCheckIn - 8
        //BaggageDrop -9
        //PassportControll - 1,2 0.1 szansy
        //Shop -1,2 - 0.6 szany
        //WaitingRoom - 14-17, 17 to VIP
        //Terminal - 18-21
        List<Integer> route = new ArrayList<>();
        Random random = new Random();
        route.add(VIP?4:random.nextInt(3));
        if(baggage) {
                route.add(8);
                route.add(9);
        }
        route.add(VIP?7:random.nextInt(3)+4);
        if(random.nextDouble()<0.1){
            route.add(random.nextBoolean()?10:11);
        }
        if(random.nextDouble()<0.6){
            route.add(random.nextBoolean()?12:13);
        }
        route.add(VIP?17:random.nextInt(3)+14);
        route.add(VIP?21:random.nextInt(3)+18);

        return route;
    }
}
