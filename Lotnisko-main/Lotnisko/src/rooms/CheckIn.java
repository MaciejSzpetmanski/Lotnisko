package rooms;

public class CheckIn extends Room{
	private final boolean VIP;
	public CheckIn(int id, int serviceTime, int maxCapacity, boolean VIP){

		super();
		this.id = id;
		//this.oczekujacy = oczekujacy;
		this.serviceTime = serviceTime;
		this.maxCapacity = maxCapacity;
		//this.banishedPeople = banishPeople;
		this.VIP = VIP;
		
	}
	
}
