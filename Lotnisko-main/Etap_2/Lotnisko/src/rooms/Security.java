package rooms;

import java.util.List;

import passangers.Passanger;

public class Security extends Room{

	protected final int id;
	
	Security(int id, List<Passanger> oczekujacy, int serviceTime, int maxCapacity, int banishPeople){
		
		this.id = id;
		this.oczekujacy = oczekujacy;
		this.serviceTime = serviceTime;
		this.maxCapacity = maxCapacity;
		this.banishPeople = banishPeople;
		
	}
	
}
