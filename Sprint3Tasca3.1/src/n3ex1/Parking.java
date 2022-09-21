package n3ex1;

import java.util.ArrayList;

public class Parking {
	private ArrayList<Vehicle> vehicles;

	public Parking(ArrayList<Vehicle> vehicles) {
		super();
		this.vehicles = vehicles;
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Parking [vehicles=" + vehicles + "]";
	}

}
