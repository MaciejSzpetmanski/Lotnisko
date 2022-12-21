package passangers;

public abstract class Person {

	private final int Id;
	private int Counter =0;

	protected Person() {
		Counter ++;
		Id = Counter;
	}
}
