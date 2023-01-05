package airport;

import rooms.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airport {
    private static List<List<Room>> airport = new ArrayList<>();
    public static void Initiate(int CheckInCapacity,int SecurityCapacity, int WRCapacity, int WRVIPCapacity, int TerminalCapacity, int PCCapacity, int ShopCapacity, int BCICapacity, int BDCapacity){
        //chceckIn - 0
        //Security - 1
        //BaggageCheckIn - 2
        //BaggageDrop - 3
        //PassportControll - 4
        //Shop -12,13 - 5
        //WaitingRoom - 6
        //Terminal - 7
        for (int i=0;i<=7;i++){
            airport.add(new ArrayList<>());
        }
        for(int i=0;i<4;i++){
            airport.get(0).add(new CheckIn(i,3,CheckInCapacity,i==3));
            airport.get(1).add(new Security(4+i,5,SecurityCapacity,i==3));
            airport.get(6).add(new WaitingRoom(14+i,0,(i==3)?WRVIPCapacity:WRCapacity,i==3));
            airport.get(7).add(new Terminal(18+i,4,TerminalCapacity));
            if(i%2==0) airport.get(4).add(new PassportControl(10+i/2,3,PCCapacity));
            else airport.get(i).add(new Shop(11+i/2,3,ShopCapacity));
        }
        airport.get(2).add(new BaggageCheckIn(8,6,BCICapacity));
        airport.get(3).add(new BaggageDrop(8,6,BDCapacity));

    }

    public static List<List<Room>> getAirport() {
        return airport;
    }
}
