package n3exercici1.beans;

public class Vehicle {
	
	private String name;

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "vehicle " + this.name;
	}
}
