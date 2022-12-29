package rooms;

public class Terminal extends Room{
	
	public Terminal(int id, int serviceTime, int maxCapacity){
		this.id = id;
		//this.oczekujacy = oczekujacy;
		this.serviceTime = serviceTime;
		this.maxCapacity = maxCapacity;
		//this.banishedPeople = banishPeople;
		
	}
	
}
