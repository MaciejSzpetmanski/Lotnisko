package airport;

import rooms.*;

import java.util.ArrayList;
import java.util.List;

import generator.PassengerGenerator;
import generator.RouteGenerator;
import passangers.Passanger;
import passangers.Person;

public class Airport implements Runnable{
    private final static List<List<Room>> airport = new ArrayList<>();
    private static List<Passanger> passengers = new ArrayList<>();
    private static int time;

    public static void Initiate(int serviceTime,int CheckInCapacity, int SecurityCapacity, int WRCapacity, int WRVIPCapacity, int TerminalCapacity, int PCCapacity, int ShopCapacity, int BCICapacity, int BDCapacity) {
        //chceckIn - 0
        //Security - 1
        //BaggageCheckIn - 2
        //BaggageDrop - 3
        //PassportControll - 4
        //Shop -12,13 - 5
        //WaitingRoom - 6
        //Terminal - 7
        // Wejœcie - 8
        for (int i = 0; i <= 8; i++) {
            airport.add(new ArrayList<>());
        }
        for (int i = 0; i < 5; i++) {
        	airport.get(0).add(new Entrance(serviceTime));
            airport.get(1).add(new CheckIn(i, 3, CheckInCapacity, i == 3));
            airport.get(2).add(new Security(4 + i, 5, SecurityCapacity, i == 3));
            airport.get(7).add(new WaitingRoom(14 + i, 0, (i == 3) ? WRVIPCapacity : WRCapacity, i == 3));
            airport.get(8).add(new Terminal(18 + i, 4, TerminalCapacity));
            if (i % 2 == 0) airport.get(4).add(new PassportControl(10 + i / 2, 3, PCCapacity));
            else airport.get(i).add(new Shop(11 + i / 2, 3, ShopCapacity));
        }
        airport.get(3).add(new BaggageCheckIn(8, 6, BCICapacity));
        airport.get(4).add(new BaggageDrop(8, 6, BDCapacity));

    }

    public static List<List<Room>> getAirport() {
        return airport;
    }

    public void run() {
        time =0;
        for(int i =0; i<180; i++ ){
           // generuj pasa¿er i dodaj do globalnej listy
            passengers.addAll(PassengerGenerator.generate(20));
           // sprawdŸ okres czekania i daj sygna³ 
            for (Passanger p:passengers){
                if(p.getWaitingTime() == Airport.getTime()) {
                	p.goNext();
                }
            }
           //sleep
           try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
            time++;
       }
      }
    
    public static int getTime() {
        return time;
    }

}
