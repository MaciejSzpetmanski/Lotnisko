package airport;

import generator.PassengerGenerator;
import generator.PlanesGenerator;
import passangers.Passanger;
import planes.Plane;
import rooms.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Airport implements Runnable{
    private final static List<List<Room>> airport = new ArrayList<>();
    private static List<Passanger> passengers = new ArrayList<>();
    private static List<Passanger> terminals = new ArrayList<>();
    private static TreeSet<Plane> planes;
    private static int time;
    private int howMany = 20;
    
    private volatile boolean isStopped = true;
    private boolean temp = true;
    int last = 0;

    public static void Initiate(int CheckInCapacity, int SecurityCapacity, int WRCapacity, int WRVIPCapacity, int TerminalCapacity, int PCCapacity, int ShopCapacity, int BCICapacity, int BDCapacity) {
        //chceckIn - 0
        //Security - 1
        //BaggageCheckIn - 2
        //BaggageDrop - 3
        //PassportControll - 4
        //Shop  - 5
        //WaitingRoom - 6
        //Terminal - 7
        // Wej�cie - 8
        Random random = new Random();
        for (int i = 0; i <= 8; i++) {
            airport.add(new ArrayList<>());
        }
        for (int i = 0; i < 5; i++) {
        	airport.get(8).add(new Entrance(random.nextInt(3)));
            airport.get(0).add(new CheckIn(i, random.nextInt(2)+3, CheckInCapacity, i == 3));
            airport.get(1).add(new Security(random.nextInt(5)+2 + i, 5, SecurityCapacity, i == 3));
            airport.get(6).add(new WaitingRoom(14 + i, 0, (i == 3) ? WRVIPCapacity : WRCapacity, i == 3));
            airport.get(7).add(new Terminal(18 + i, 4, TerminalCapacity));
            if (i % 2 == 0) airport.get(4).add(new PassportControl(10 + i / 2, random.nextInt(3)+2, PCCapacity));
            else airport.get(5).add(new Shop(11 + i / 2, 3+random.nextInt(15), ShopCapacity));
        }
        airport.get(2).add(new BaggageCheckIn(8, 6, BCICapacity));
        airport.get(3).add(new BaggageDrop(8, 6, BDCapacity));
        planes= new TreeSet<>(PlanesGenerator.generate(20));

        for (List<Room> l:airport) {
            for (Room r:l) {
                System.out.println(r);
            }
            System.out.println("#################");

        }

    }

    public static List<List<Room>> getAirport() {
        return airport;
    }

    public void run() {
        boolean takeOff=false;
        Plane plane = null;
    	do {
    	while(!isStopped) {
        time = 0;

        //Initiate(2, 7, 7, 7, 7, 7, 7, 7, 7, 7);
        //passengers.addAll(PassengerGenerator.generate(30));
        for(int i =last; i<180; i++ ){
           // generuj pasa�er i dodaj do globalnej listy
            if(i<160){ passengers.addAll(PassengerGenerator.generate(howMany));}

           // sprawd� okres czekania i daj sygna� 
            for (Passanger p:passengers){
                if(p.getWaitingTime() <= Airport.getTime()) {
                	p.goNext();
                }
            }

            //spr odpoty
            if(planes.first().getOdlot()<=time){
                //odlatuje zabieraj�c pasa�er�w
                takeOff = true;
                plane = planes.pollFirst();   //usuwa i zwraca pierwszy
                plane.takeOff();

            }
            else takeOff = false;

            StaticGUI.refresh();
            if(takeOff){
                StaticGUI.odlot(plane.getTerminal());
            }

           //sleep
           try {
			Thread.sleep(1000);
		    } catch (InterruptedException e) {
			    e.printStackTrace();
		    }
            time++;
           if(takeOff){
               StaticGUI.przylot(plane.getTerminal());
           }
            if(isStopped) {
                last = i;
                break;
            }

       }
    	}
    	}while(temp);
      }
    
    public void stop(){
        isStopped = true;

    }
    
    public void start(){
        isStopped = false;
    }
    
    public static int getTime() {
        return time;
    }

    public static List<Passanger> getPassengers() {
        return passengers;
    }
    
    public static TreeSet<Plane> getPlanes() {
        return planes;
    }


    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }
}
