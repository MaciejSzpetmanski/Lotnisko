package rooms;

public class WaitingRoom extends Room{
	private final boolean VIP;

	public WaitingRoom(int id, int serviceTime, int maxCapacity, boolean VIP){

		super();
		this.id = id;
		//this.oczekujacy = oczekujacy;
		this.serviceTime = serviceTime; // niepotrzebne
		this.maxCapacity = maxCapacity;
		//this.banishedPeople = banishPeople;
		this.VIP = VIP;
		
	}
	
}
