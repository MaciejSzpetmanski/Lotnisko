package rooms;

import java.util.List;

import passangers.Passanger;

public class CheckIn extends Room{

	protected final int id;
	
	CheckIn(int id, List<Passanger> oczekujacy, int serviceTime, int maxCapacity, int banishPeople){
		
		this.id = id;
		this.oczekujacy = oczekujacy;
		this.serviceTime = serviceTime;
		this.maxCapacity = maxCapacity;
		this.banishPeople = banishPeople;
		
	}
	
}
