package rooms;

public abstract class Room extends AirportParts implements Comparable<Room> {

	//protected List<Passanger> oczekujacy;
	protected int id;
	protected int maxCapacity;
	protected int capacityNow = 0;
	//protected int banishedPeople;

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Room o) {
		return this.id-o.getId();
	}

	public int getCapacityNow() {
		return capacityNow;
	}

	public int getServiceTime() {
		return serviceTime;
	}

	public void increaseCapacityNow(){
		capacityNow++;
	}
	
	public void decreaseCapacityNow(){
		capacityNow--;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	
}
