package airport;

import rooms.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airport {
    private static List<Room> airport = new ArrayList<>();
    public static void Initiate(int CheckInCapacity,int SecurityCapacity, int WRCapacity, int WRVIPCapacity, int TerminalCapacity, int PCCapacity, int ShopCapacity, int BCICapacity, int BDCapacity){
        //airport.add(new Entry(3));
        for(int i=0;i<4;i++){
            airport.add(new CheckIn(i,3,CheckInCapacity,i==3));
            airport.add(new Security(4+i,5,SecurityCapacity,i==3));
            airport.add(new WaitingRoom(14+i,0,(i==3)?WRVIPCapacity:WRCapacity,i==3));
            airport.add(new Terminal(18+i,4,TerminalCapacity));
            if(i%2==0) airport.add(new PassportControl(10+i/2,3,PCCapacity));
            else airport.add(new Shop(11+i/2,3,ShopCapacity));
        }
        airport.add(new BaggageCheckIn(8,6,BCICapacity));
        airport.add(new BaggageDrop(8,6,BDCapacity));
        Collections.sort(airport);
    }

    public static List<Room> getAirport() {
        return airport;
    }
}
