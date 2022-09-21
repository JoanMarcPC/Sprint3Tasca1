package n3ex1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Parking parking;
		parking = prepararDades();

		AcumuladorCommands commands = Commands(parking);

		commands.execute();

	}

	public static Parking prepararDades() {

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Cotxe("Civic"));
		vehicles.add(new Avio("Boeing"));
		vehicles.add(new Vaixell("Ever Given"));

		return new Parking(vehicles);

	}

	public static AcumuladorCommands Commands(Parking parking) {
		ArrayList<Command> commands = new ArrayList<Command>();

		for (int i = 0; i < parking.getVehicles().size(); i++) {
			commands.add(new Arrencar(parking.getVehicles().get(i)));
			commands.add(new Frenar(parking.getVehicles().get(i)));
			commands.add(new Accelerar(parking.getVehicles().get(i)));

		}
		return new AcumuladorCommands(commands);

	}
}
