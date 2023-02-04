package rooms;

public class Security extends Room{
	private final boolean VIP;
	
	public Security(int id, int serviceTime, int maxCapacity, boolean VIP){
		super();
		this.id = id;
		this.serviceTime = serviceTime;
		this.maxCapacity = maxCapacity;
		//this.banishedPeople = banishPeople;
		this.VIP = VIP;
		
	}
	
}
